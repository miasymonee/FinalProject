package io.proj.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "Hi";
	}


}
