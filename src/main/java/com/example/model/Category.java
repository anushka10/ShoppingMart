package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String category_id;
	private String categoryName;
	private List<Product> products;

	public Category(String category_id, String categoryName) {
		this.category_id = category_id;
		this.categoryName = categoryName;
		this.products = new ArrayList<Product>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		products.add(product);
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result
				+ ((category_id == null) ? 0 : category_id.hashCode());
		result = prime * result
				+ ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (category_id == null) {
			if (other.category_id != null)
				return false;
		} else if (!category_id.equals(other.category_id))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", categoryName="
				+ categoryName + ", products=" + products + "]";
	}
}
