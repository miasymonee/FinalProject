package io.proj.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "SF Description", "April 2018"),
			new Topic("Java", "Core Java", "Java Description", "April 2018"),
			new Topic("Javascript", "React JS", "JS Description", "April, 2018"));
	
	
	public List<Topic> getAllTopics(){
		
		return topics; 
	}
	


}
