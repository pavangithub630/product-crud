package com.products.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.app.entity.Product;
import com.products.app.repository.ProductRepository;


@RestController
@RequestMapping(value = "home")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		
		return productRepository.save(product);
		
	}
	@GetMapping("/list-products")
	public List<Product> getProducts() {
		
		return productRepository.findAll();
		
	}
	
	

}
