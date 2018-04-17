package io.Data;

import org.json.JSONException;
import org.json.JSONObject;

public class Player {
	
	private String Created_Datetime;
	private String Last_Login_Datetime;
	private int Leaves;
	private int Level;
	private int Losses;
	private int MasteryLevel;
	private String Name;
	private int Rank_Stat;
	private String TeamId;
	private String Team_Name;
	private int Wins;
	private String reset_msg;
	
	public Player(JSONObject json) throws JSONException {
		
		Created_Datetime = json.getString("CreatedDatetime");
		Last_Login_Datetime = json.getString("Last_Login_Datetime");
		Leaves = json.getInt("Leaves");
		Level = json.getInt("Level");
		Losses = json.getInt("Losses");
		MasteryLevel = json.getInt("MasteryLevel");
		Name = json.getString("Name");
		Rank_Stat = json.getInt("Rank_Stat");
		TeamId= json.getString("TeamId");
		Team_Name = json.getString("Team_Name");
		Wins = json.getInt("Wins");
		reset_msg = json.getString("reset_msg");

		
	}

	public String getCreated_Datetime() {
		return Created_Datetime;
	}

	public void setCreated_Datetime(String created_Datetime) {
		Created_Datetime = created_Datetime;
	}

	public String getLast_Login_Datetime() {
		return Last_Login_Datetime;
	}

	public void setLast_Login_Datetime(String last_Login_Datetime) {
		Last_Login_Datetime = last_Login_Datetime;
	}

	public int getLeaves() {
		return Leaves;
	}

	public void setLeaves(int leaves) {
		Leaves = leaves;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public int getLosses() {
		return Losses;
	}

	public void setLosses(int losses) {
		Losses = losses;
	}

	public int getMasteryLevel() {
		return MasteryLevel;
	}

	public void setMasteryLevel(int masteryLevel) {
		MasteryLevel = masteryLevel;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRank_Stat() {
		return Rank_Stat;
	}

	public void setRank_Stat(int rank_Stat) {
		Rank_Stat = rank_Stat;
	}

	public String getTeamId() {
		return TeamId;
	}

	public void setTeamId(String teamId) {
		TeamId = teamId;
	}

	public String getTeam_Name() {
		return Team_Name;
	}

	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}

	public int getWins() {
		return Wins;
	}

	public void setWins(int wins) {
		Wins = wins;
	}

	public String getReset_msg() {
		return reset_msg;
	}

	public void setReset_msg(String reset_msg) {
		this.reset_msg = reset_msg;
	}
	
	
	
	

}
