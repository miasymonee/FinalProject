package io.proj.Topic;

public class Topic {
	
	private String topicid;
	
	private String name;
	
	private String description;
	
	private String date;
	
	
	public Topic() {
		
	}
	

	public Topic(String topicid, String name, String description, String date) {
		super();
		this.topicid = topicid;
		this.name = name;
		this.description = description;
		this.date = date;
	}
	
	



	public String getTopicid() {
		return topicid;
	}


	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	

}
