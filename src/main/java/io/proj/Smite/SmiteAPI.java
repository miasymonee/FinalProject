package io.proj.Smite;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import com.eclipsesource.json.JsonObject;






public class SmiteAPI {
	
	private String sessionID;
	private String authKey;
	private String devID;
	
	private long sessionStart;
	
	public static final String RESPONSE_TYPE_JSON = "json";
	private String responseFormat = RESPONSE_TYPE_JSON;
	
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
	
	
	public Boolean createSession() throws Exception 
	{
		
		String sessionURL = getURL(combine(new String[] {baseURL + "createsessionjson" ,  devID, getSignature("createsession"), getTimestamp() }, "/"));
		
		if (sessionURL == null) return false;
		
	    JsonObject object = JsonObject.readFrom(sessionURL);
        if (object.get("ret_msg").asString().equals("Approved")) {
            sessionID = object.getString("session_id", null);
            sessionStart = System.currentTimeMillis();
            return true;
        } else {
            return false;
        }	
	}
	
	 public String testSession() throws Exception {
	        if (!isSessionValid() && !createSession()) return null;
	        return getURL(combine(new String[] {
	                baseURL + "testsession" + responseFormat,
	                devID,
	                getSignature("testsession"),
	                sessionID,
	                getTimestamp()
	        }, "/"));
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
	  
	  private boolean isSessionValid() {
	        return sessionID != null && Math.abs(System.currentTimeMillis() - sessionStart) <= 15 * 60 * 1000;
	}
	  
	  
	  public String getPlayer(String player) throws Exception {
	        if (!isSessionValid() && !createSession()) return "session null";
	        return getURL(combine(new String[] {
	                baseURL + "getplayer" + responseFormat,
	                devID,
	                getSignature("getplayer"),
	                sessionID,
	                getTimestamp(),
	                player
	        }, "/"));
	}
	  
	  public String getFriends(String player) throws Exception{
	        if (!isSessionValid() && !createSession()) return null;
	        return getURL(combine(new String[] {
	                baseURL + "getfriends" + responseFormat,
	                devID,
	                getSignature("getfriends"),
	                sessionID,
	                getTimestamp(),
	                player
	        }, "/"));
	}
	  
	  public String getPlayerStatus(String player) throws Exception {
	        if (!isSessionValid() && !createSession()) return null;
	        return getURL(combine(new String[] {
	                baseURL + "getplayerstatus" + responseFormat,
	                devID,
	                getSignature("getplayerstatus"),
	                sessionID,
	                getTimestamp(),
	                player
	        }, "/"));
	}
	  
	  public String getTopMatches() throws Exception {
	        if (!isSessionValid() && !createSession()) return null;
	        return getURL(combine(new String[] {
	                baseURL + "gettopmatches" + responseFormat,
	                devID,
	                getSignature("gettopmatches"),
	                sessionID,
	                getTimestamp()
	        }, "/"));
	}
	  
	   public String getItems(String languageCode) throws Exception {
	        if (!isSessionValid() && !createSession()) return null;
	        return getURL(combine(new String[] {
	                baseURL + "getitems" + responseFormat,
	                devID,
	                getSignature("getitems"),
	                sessionID,
	                getTimestamp(),
	                languageCode
	        }, "/"));
	}
	  
	  	  
} // end class