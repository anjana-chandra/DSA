package com.example.demo.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.FakeStoreProductDTO;
import com.example.demo.dto.GenericProductDto;
import com.example.demo.exception.ProductNotFoundException;

public interface ProductService {
	
	public GenericProductDto getProductById(Long id) throws ProductNotFoundException;
	
	public void getAllProducts() ;
	
	public void deleteProductById() ;
	
	public void createProduct();
	
	public void updateProductById();

}
