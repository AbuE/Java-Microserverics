package com.example.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CategoryEntity;
import com.example.model.beans.Category;
import com.example.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories(){

		List<Category> categoryList=new ArrayList<Category>();
		List<CategoryEntity> categoryEntities=categoryRepository.findAll();

		for (CategoryEntity entity:categoryEntities) {
			Category categoryModel=new Category();
			categoryModel.setCategoryDescription(entity.getCategoryDescription());
			categoryModel.setCategoryId(entity.getCategoryId());
			categoryModel.setCategoryName(entity.getCategoryName());
			categoryModel.setImageUrl(entity.getImageUrl());
			categoryList.add(categoryModel);
		}

		return categoryList;	
	}

	public Category saveCategory(Category categoryModel){

		CategoryEntity entity=new CategoryEntity();
		entity.setCategoryId(UUID.randomUUID());
		entity.setCategoryName(categoryModel.getCategoryName());
		entity.setCategoryDescription(categoryModel.getCategoryDescription());
		entity.setImageUrl(categoryModel.getImageUrl());
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedDate(LocalDate.now());
		entity=categoryRepository.save(entity);
		categoryModel.setCategoryId(entity.getCategoryId());
		return categoryModel;	
	}

}
