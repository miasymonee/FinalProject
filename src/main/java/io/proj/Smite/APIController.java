package io.proj.Smite;


//import com.google.gson.*;

//import com.google.gson.annotations.Expose;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;


@RestController
public class APIController {
	
	SmiteAPI smite = new SmiteAPI ("2553", "D530E077EC514654A69632CBE079BFCF");
	
	@RequestMapping("/test")
	public String test() throws Exception {
		
		smite.createSession();
		
		String test = smite.testSession();

		return test;

	}
	
	@RequestMapping("/player")
	public String displayPlayer() throws Exception{
		
		
		String player = "PacSnackz";
		
		smite.createSession();
		
		String test = smite.getPlayer(player);
		
		JsonArray array = Json.parse(test).asArray();
		
		String json = array.asString();
		
		return json;
		

	}
	
	@RequestMapping("/friends")
	public String displayFriends() throws Exception{
		
		String player = "PacSnackz";
		
		smite.createSession();
		
		String friends = smite.getFriends(player);
		
		return friends;
	}
	
	@RequestMapping("/status")
	public String displayStatus() throws Exception{
		
		String player = "PacSnackz";
		
		smite.createSession();
		
		String status = smite.getPlayerStatus(player);
		
		return status;
		
	}
	
	@RequestMapping("/top")
	public String displayTop() throws Exception{
		
		smite.createSession();
		
		String top = smite.getTopMatches();
		
		return top;
	}
	@RequestMapping("/items")
	public String displayItems() throws Exception{
		
		String languageCode = "1";
		
		smite.createSession();
		
		String items = smite.getItems(languageCode);
		
		return items; 
	}
	
	
}
