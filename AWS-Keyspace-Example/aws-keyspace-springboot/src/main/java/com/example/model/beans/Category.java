package com.example.model.beans;

import java.util.UUID;

public class Category {
	
	private UUID categoryId;
	private String categoryName;
	private String categoryDescription;
	private String imageUrl;
	
	public UUID getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(UUID categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
