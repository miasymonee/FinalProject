package io.Smite;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;





public class SmiteAPI {
	
	private String sessionID;
	private String authKey = "D530E077EC514654A69632CBE079BFCF";
	private String devID = "2553";
	
	private long sessionStart;
	
	public static final String RESPONSE_TYPE_JSON = "json";
	
	private static final String baseURL = "http://api.smitegame.com/smiteapi.svc/";
	
	
	
	
	//This is the constructor
	public SmiteAPI(String devID, String authKey) 
	{
		
		this.authKey = authKey;
		this.devID = devID;
		
		sessionStart = 0;
	}
	
	
	
	// FOLLOW THIS FORMAT -> createsession[ResponseFormat]/{developerId}/{signature}/{timestamp}
	//step to Authenticate the developerId/signature for further API use.
	
	
	private Boolean createSession() throws Exception 
	{
		
		String sessionURL = getURL(combine(new String[] {baseURL + "createsessionjson" ,  devID, getSignature("createsession"), getTimestamp() }, "/"));
		
		if (sessionURL == null) return false;
		
		else return true;
			
		
	}
	
	
	//Returns Timestamp needed for 
	
	  public String getTimestamp() 
	  {
	        
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	       dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	        
	        return dateFormat.format(new Date());
	  }
	
	
	//returns the MD5 hashed signature
	 private String getSignature(String method) 
	 {
	        return getMD5(devID+ method + authKey+ getTimestamp());
	 
	 }
	 
	
	  public String getMD5(String input) 
	  {
	        try {
	            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	            messageDigest.update(input.getBytes());

	            byte[] data = messageDigest.digest();

	            // Convert from byte to hex
	            StringBuilder stringBuffer = new StringBuilder();
	            for (byte b : data) {
	                String hex = Integer.toHexString(0xff & b);
	                if (hex.length() == 1) stringBuffer.append("0");
	                stringBuffer.append(hex);
	            }

	            return stringBuffer.toString();
	        } catch (NoSuchAlgorithmException e) {
	            return null;
	        }
      
	}
	  

	  private String combine(String[] items, String delimiter) 
	  {
	        
		  int x = items.length;
	        
	        if (x == 0) return null;

	        StringBuilder builder = new StringBuilder();
	        builder.append(items[0]);

	        for (int i = 1; i < items.length; i++) {
	            builder.append(delimiter).append(items[i]);
	        }

	        return builder.toString();
	}
	  

	  private String getURL(String baseUrl) throws Exception {
	        
		  return ClientHttp.fetch(baseUrl);
	}
	  
	  
	 
	 
	
	
	
	

}
