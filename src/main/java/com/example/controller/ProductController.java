package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Product;
import com.example.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("products",productService.findAll());
		return "products";
	}
	
	@RequestMapping(value="/product/{productId}", method=RequestMethod.GET)
	public String getProduct(@PathVariable String productId, Model model){
		
		Product product = productService.findById(productId);
		System.out.println(productId+"------ "+product);
		if(product!=null){
			System.out.println("=========="+product.getName());
			model.addAttribute("product",product);
		}
		return "productDetail";
	}
}
