package com.example.dao;

import com.example.model.Product;

public interface CartOperationDao {
	
	public void addProductToCart(Product product,int quantity);
	public void removeProductFromCart(Product productCode,int quantity);
	
}
