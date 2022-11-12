package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.beans.Category;
import com.example.service.CategoryService;
import com.example.utils.Constants;

@RestController
@RequestMapping(Constants.REST_CONTEXT_PATH)
public class WebAppController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(path = Constants.PATH_TEST,method = RequestMethod.GET)
	@ResponseBody
	public String testWS() {

		return "Welcome, <B>Its Up and running</B>";
	}

	@RequestMapping(path = Constants.PATH_GET_CATEGORIES,method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getAllCategories() {

		return categoryService.getAllCategories();
	}

	@RequestMapping(path = Constants.PATH_SAVE_CATEGORY,method = RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category category) {

		return categoryService.saveCategory(category);
	}

}
