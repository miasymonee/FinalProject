package io.Smite;

import java.io.IOException;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.http.HttpMethod;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.RequestBuilder;





public class ClientHttp {
	

	private static final String baseURL = "http://api.smitegame.com/smiteapi.svc/";
	

	public static String fetch(String baseURL) throws Exception  {
		
		HttpClient client = HttpClientBuilder.create().build();
		
		

	        try {
	        	
	        	HttpGet getRequest = new HttpGet(baseURL);
	    		
	    		getRequest.addHeader("accept", "application/JSON");
	    		
	    		HttpResponse response = client.execute(getRequest);
	    		
	    		 int statusCode = response.getStatusLine().getStatusCode();
	    	        if (statusCode != 200)
	    	        {
	    	            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
	    	        }
	    	        
	           return response.toString();
	           
	        } 
	        catch (IOException e) 
	        {
	            return null;
	        }
		
		
	}
	
	
	

	


}
