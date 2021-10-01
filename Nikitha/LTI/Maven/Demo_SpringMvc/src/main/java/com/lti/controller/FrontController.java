package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

	@RequestMapping("/hello")
	
	public String show()
	{
		String msg="Hello Wecome to my first MVC demo";
		return "hello";
	}
	
}
