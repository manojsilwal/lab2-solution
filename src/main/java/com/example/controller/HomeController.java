package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.UserService;
import com.example.service.UserServiceImpl;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String welcomePage(){
		return "home";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("name") String name, @RequestParam("pass") String pass,Model model){
		UserServiceImpl userService = new UserServiceImpl();
		
		if(userService.loginCheck(name, pass)){
			return "home";
		}
		else{
			model.addAttribute("error","UserName and/or password incorrect");
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginpage(@ModelAttribute("error") String error, Model model){
		model.addAttribute("error", error);
		return "login";
	}
}
