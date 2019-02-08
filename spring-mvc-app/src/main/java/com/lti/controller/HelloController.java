package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//replacement of doGet/doPost methods
	//@RequestMapping("/hello")
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public @ResponseBody String hello() {
		return "Hello from Spring MVC";
	
	}
}
