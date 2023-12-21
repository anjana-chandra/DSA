package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FakeStoreProductDTO;
import com.example.demo.dto.GenericProductDto;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	private ProductService productService;
	
	ProductController(@Qualifier("fakeStore") ProductService productService){
		this.productService = productService;
	}
	@GetMapping("/{id}")
	public GenericProductDto getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
		return this.productService.getProductById(id);
	}
	
	
	public void getAllProducts() {
		
	}
	
	public void deleteProductById() {
		
	}
	
	public void createProduct() {
		
	}
	public void updateProductById() {
		
	}
}
