package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cartId; 
	private String cartName;
	List<Product> productList;
	Map<String, Integer> productMap;
	List categoryList;
	public Cart(String cartId,String cartName) {
		this.cartId = cartId;
		this.cartName = cartName;
		productList = new ArrayList<Product>();
		categoryList = new ArrayList<Product>();
		productMap = new HashMap<String, Integer>();
	}
	
	
	public String getCartId() {
		return cartId;
	}


	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	public void setCartName(String cartName) {
		this.cartName = cartName;
	}


	public List<Product> getProductList() {
		return productList;
	}

	public String getCartName() {
		return cartName;
	}

	public Map<String, Integer> getProductMap() {
		return productMap;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public void setProductMap(Map<String, Integer> productMap) {
		this.productMap = productMap;
	}	
	public List getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List categoryList) {
		this.categoryList = categoryList;
	}

	
}
