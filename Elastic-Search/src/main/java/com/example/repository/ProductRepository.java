package com.example.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product,String> {
	
	 List<Product> findByProductName(String name);

	 List<Product> findByProductId(int id);

}
