package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.ExceptionDto;

@ControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(ProductNotFoundException.class)
	private ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException exception){
		ExceptionDto dto = new ExceptionDto();
		dto.setStatus(HttpStatus.NOT_FOUND);
		dto.setMessage(exception.getMessage());
		return new ResponseEntity<>(dto,HttpStatus.NOT_FOUND);
	}
}
