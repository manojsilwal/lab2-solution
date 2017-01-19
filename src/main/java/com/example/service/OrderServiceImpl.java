package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Product;
import com.example.repository.ProductRepo;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	ProductRepo productRepo;

	@Override
	public void orderPlace(String productId, int qty) {
		// TODO Auto-generated method stub
		Product product = productRepo.remove(productId);
		product.setUnitsInStock(product.getUnitsInStock()-qty);
		
		productRepo.addProduct(product);
	}
	
}
