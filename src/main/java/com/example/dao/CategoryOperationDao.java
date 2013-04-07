package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface CategoryOperationDao {

	public String createNewCategory(String categoryId,String categoryName);
	public String addProductToCategory(Product product);
	public String removeProductFromCategory(Product product);
	public List<Product> getAllProductsByCategoryId(String categoryId);
	public List<Product> getAllProducts(); 
}
