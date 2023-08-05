package com.spring.mvc.lc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.lc.api.UserInfoDTO;

@Controller
public class MyLoveController {

	@RequestMapping(value = "/love")
	public String sayHello() {

		return "welcome-form";
	}

	@RequestMapping(value = "/process")
	public String loveCalc(UserInfoDTO userDto, Model model) {
		
		System.out.println("Your name is : " + userDto.getUserName() + " Crush name is :" + userDto.getCrushName());
		
		model.addAttribute("userInfo", userDto);
		
		return "love-form";
	}

}
