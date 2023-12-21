package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.FakeStoreProductDTO;
import com.example.demo.dto.GenericProductDto;
import com.example.demo.exception.ProductNotFoundException;

@Service("fakeStore")
public class FakeStoreProductService implements ProductService {
	 private RestTemplateBuilder restTemplateBuilder;

	    private String specificProductUrl = "https://fakestoreapi.com/products/{id}";
	    private String genericProductUrl = "https://fakestoreapi.com/products/";

	    FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
	        this.restTemplateBuilder = restTemplateBuilder;
	    }

	    private static GenericProductDto convertToGenericProductDto(FakeStoreProductDTO fakeStoreProductDto) {
	        GenericProductDto genericProductDto = new GenericProductDto();
	        genericProductDto.setId(fakeStoreProductDto.getId());
	        genericProductDto.setImage(fakeStoreProductDto.getImage());
	        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
	        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
	        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
	        genericProductDto.setPrice(fakeStoreProductDto.getPrice());

	        return genericProductDto;
	    }

	    @Override
	    public GenericProductDto getProductById(Long id) throws ProductNotFoundException {
	        //Integrate the FakeStore API.
	        //RestTemplate

	        RestTemplate restTemplate = restTemplateBuilder.build();
	        ResponseEntity<FakeStoreProductDTO> responseEntity =
	                restTemplate.getForEntity(specificProductUrl, FakeStoreProductDTO.class, id);
	        FakeStoreProductDTO dto = responseEntity.getBody();
	        if(dto==null) {
	        	throw new ProductNotFoundException("Product with id "+id+" doesnt exist");
	        }
	        //Convert FakeStoreProductDto to GenericProductDto before returning.
	        return convertToGenericProductDto(responseEntity.getBody());
	    }

	    @Override
	    public void getAllProducts() {
	        RestTemplate restTemplate = restTemplateBuilder.build();

	        ResponseEntity<FakeStoreProductDTO[]> responseEntity =
	                restTemplate.getForEntity(genericProductUrl, FakeStoreProductDTO[].class);

	        //ArrayList<Integer> => ArrayList.class -> Erasure

	        List<GenericProductDto> result = new ArrayList<>();
	        List<FakeStoreProductDTO> fakeStoreProductDtos = List.of(responseEntity.getBody());
	        for(FakeStoreProductDTO fakeStoreProductDto : fakeStoreProductDtos) {
	            result.add(convertToGenericProductDto(fakeStoreProductDto));
	        }

//	        return result;
	    }

	@Override
	public void deleteProductById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductById() {
		// TODO Auto-generated method stub
		
	}

}
