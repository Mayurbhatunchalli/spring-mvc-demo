package com.homecafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping(value = "/cafe")
	public String showMyCafe(Model model) {
		
		String name = "John";
		
		model.addAttribute("myName", name);
		
		return "my-cafe";
	}
	
	@RequestMapping("/processorder")
	public String processOrder(HttpServletRequest req, Model model) {
		
		model.addAttribute("orderName", req.getParameter("order"));
		
		return "process-order";
	}

}
