package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.requestresponse.model.SearchProductRequest;

@RestController
public class ElasticSearchController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(path = "/searchproduct",method = RequestMethod.POST)
	@ResponseBody
	public List<Product> searchProductByName(@RequestBody SearchProductRequest searchProductRequest) {
		List<Product> productList=new ArrayList<Product>();
		productList=productRepository.findByProductName(searchProductRequest.getName());
		return productList;		
	}
	
	@RequestMapping(path = "/test",method = RequestMethod.GET)
	@ResponseBody
	public String testWS() {
		return "Elastic Search WS Controller Up and Running";		
	}

}
