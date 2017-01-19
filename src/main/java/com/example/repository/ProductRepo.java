package com.example.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Repository;

import com.example.domain.Product;

@Repository
public class ProductRepo{
	Map<String,Product> products = new HashMap<>();

	public ProductRepo(){
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setName("Cookies");
		product1.setUnitPrice(new BigDecimal(12));
		product1.setUnitsInStock(10);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setName("Lays");
		product2.setUnitPrice(new BigDecimal(120));
		product2.setUnitsInStock(100);
		products.put(product1.getProductId(),product1);
		products.put(product2.getProductId(),product2);
	}
	
	
	public Product getProduct(String productId){
		
		return products.get(productId);
		
	}
	public List<Product> findAll(){
		return new ArrayList<Product>(products.values());
	}
	
	public Product remove(String productId){
		return products.remove(productId);
	}
	
	public void addProduct(Product product){
		products.put(product.getProductId(), product);
	}
}
