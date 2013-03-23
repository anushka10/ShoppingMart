package com.example.dao;

import com.example.model.Product;

public interface CartOperation {
	
	public void addProductToCart(Product product,int quantity);
	public void removeProductFromCart(Product productCode,int quantity);
	
}
