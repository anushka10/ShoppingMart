package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cartName;
	List<Product> productList;
	Map<String, Integer> productMap;
	List categoryList;
	public Cart(String cartName) {
		this.cartName = cartName;
		productList = new ArrayList<Product>();
		categoryList = new ArrayList<Product>();
		productMap = new HashMap<String, Integer>();
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
