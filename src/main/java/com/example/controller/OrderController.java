package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Product;
import com.example.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	
	@RequestMapping(value="/order", method=RequestMethod.POST)
	public String order(@RequestParam String id, @RequestParam int qty, Model model){
		System.out.println("inside order");
		orderService.orderPlace(id, qty);
		return "redirect:/products";
	}
}
