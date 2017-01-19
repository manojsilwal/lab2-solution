package com.example.service;

import java.util.List;

import com.example.domain.Product;


public interface ProductService {
	public List<Product> findAll();
	public Product findById(String productId);
}
