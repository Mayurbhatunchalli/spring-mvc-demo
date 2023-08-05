package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomController {
	
	@RequestMapping(value = "/sugar")
	public String giveSuger() {
		
		return "Sugar";
	}
	

}
