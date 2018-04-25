package io.Data;

import com.eclipsesource.json.JsonObject;

public class Player {
	
	private String Created_Datetime;
	private String ID;
	private String Last_Login_Datetime;
	private int Leaves;
	private int Level;
	private int Losses;
	private int MasteryLevel;
	private String Name;
	private String Personal_Status_Message;
	private String Region;
	private String TeamId;
	private String Team_Name;
	private int Tier_Conquest;
	private int Tier_Duel;
	private int Total_Achievements;
	private int Total_Worshippers;
	private int Wins;
	
	public Player() {
		
	}
	/*
	public Player(JsonObject jsonObject) {
		
		
		Created_Datetime = jsonObject.get("Created_Datetime").asString();
		ID = jsonObject.get("Id").asString();
		Last_Login_Datetime = jsonObject.get("Last_Login_Datetime").asString();
		Leaves = jsonObject.get("Leaves").asInt();
		Level = jsonObject.get("Level").asInt();
		Losses = jsonObject.get("Losses").asInt();
		MasteryLevel = jsonObject.get("MasteryLevel").asInt();
		Name = jsonObject.get("Name").asString();
		Personal_Status_Message = jsonObject.get("Personal_Status_Message").asString();
		Region = jsonObject.get("Region").asString();
		TeamId = jsonObject.get("TeamId").asString();
		Team_Name = jsonObject.get("Team_Name").asString();
		Tier_Conquest = jsonObject.get("Tier_Conquest").asInt();
		Tier_Duel = jsonObject.get("Tier_Duel").asInt();
		Total_Achievements = jsonObject.get("Total_Achievements").asInt();
		Total_Worshippers =  jsonObject.get("Total_Worshippers").asInt();
		Wins = jsonObject.get("Wins").asInt();
	}
*/
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPersonal_Status_Message() {
		return Personal_Status_Message;
	}

	public void setPersonal_Status_Message(String personal_Status_Message) {
		Personal_Status_Message = personal_Status_Message;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public int getTier_Conquest() {
		return Tier_Conquest;
	}

	public void setTier_Conquest(int tier_Conquest) {
		Tier_Conquest = tier_Conquest;
	}

	public int getTier_Duel() {
		return Tier_Duel;
	}

	public void setTier_Duel(int tier_Duel) {
		Tier_Duel = tier_Duel;
	}

	public int getTotal_Achievements() {
		return Total_Achievements;
	}

	public void setTotal_Achievements(int total_Achievements) {
		Total_Achievements = total_Achievements;
	}

	public int getTotal_Worshippers() {
		return Total_Worshippers;
	}

	public void setTotal_Worshippers(int total_Worshippers) {
		Total_Worshippers = total_Worshippers;
	}



}
