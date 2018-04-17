package io.proj.Smite;

//import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.Data.Player;

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
		
		return test;
		
	}
	
	@RequestMapping("/friends")
	public String displayFriends() throws Exception{
		
		String player = "PacSnackz";
		
		smite.createSession();
		
		String friends = smite.getFriends(player);
		
		return friends;
	}
	
	

}
