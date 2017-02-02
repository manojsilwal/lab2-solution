package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.User;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

@Controller
public class HomeController {
	@Autowired
	UserService userService;

		
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String saveUser(User user, Model model){
		userService.save(user);
		return "redirect:/users";
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String addUser(User user, Model model){
		model.addAttribute("users",userService.findAll());
		return "users";
	}
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public String addUserPage(User user, Model model){
		return "addUser";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCheck(){
		System.out.println("inside security check");
		return "products";

	}
}
