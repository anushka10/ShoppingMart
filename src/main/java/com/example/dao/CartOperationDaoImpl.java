package com.example.dao;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import com.example.model.Cart;
import com.example.model.Category;
import com.example.model.Product;

public class CartOperationDaoImpl implements CartOperationDao {

	private Cart cart;

	public CartOperationDaoImpl(Cart cart) {
		this.cart = cart;
	}

	public void addProductToCart(Product product, int quantity) {
		cart.getProductList().add(product);
		String add = "ADD";
		updateProductQuantityMap(product, quantity, add);
	}

	public void removeProductFromCart(Product product, int quantity) {
		if (cart.getProductList().contains(product)) {
			cart.getProductList().remove(product);
		} else {
			throw new NoSuchElementException();
		}

		String remove = "Delete";
		updateProductQuantityMap(product, quantity, remove);
	}

	// Updating productMap
	public void updateProductQuantityMap(Product product, int productQuantity,
			String value) {
		Map<String, Integer> productMap = cart.getProductMap();
		if (value.equalsIgnoreCase("ADD")) {
			addProduct(productMap, product, productQuantity);

		} else if (value.equalsIgnoreCase("Delete")) {
			deleteProduct(productMap, product, productQuantity);

		}
		cart.setProductMap(productMap);
	}

	// deleting product from map
	public void deleteProduct(Map productMap, Product product,
			int productQuantity) {
		if (productMap.containsKey(product.getProductCode())) {
			productMap.remove(product.getProductCode());
		}
	}

	// adding product to map
	public void addProduct(Map productMap, Product product, int productQuantity) {
		if (!cart.getProductMap().containsKey(product.getProductCode())) {
			int currentQuantity = 0;
			currentQuantity += productQuantity;
			productMap.put(product.getProductCode(), currentQuantity);
		}
	}

/*	@Override
	public void addCategoryToCart(Category category) {
		cart.getCategoryList().add(category);
		String add = "ADD";
		updateCategory(category, add);

	}
*//*
	private void updateCategory(Category category, String value) {
		List<Category> categoryList = cart.getCategoryList();
		if (value.equalsIgnoreCase("ADD")) {
			addCategory(categoryList, category);

		} else if (value.equalsIgnoreCase("Delete")) {
			deleteCatgeory(categoryList, category);

		}
		cart.setCategoryList(categoryList);

	}
*/
/*	private void addCategory(List categoryList, Category category) {
		if (!cart.getCategoryList().contains(category.getCategory_id())) {
			int currentQuantity = 0;
			int categoryQuantity = 0;
			currentQuantity += categoryQuantity;
			categoryList.add(category.getCategory_id());
		}

	}

	private void deleteCatgeory(List categoryList, Category category) {
		if (categoryList.contains(category.getCategory_id())) {
			categoryList.remove(category.getCategory_id());
		}

	}

	@Override
	public void removeCategoryFromCart(Category category) {
		if (cart.getCategoryList().contains(category)) {
			cart.getCategoryList().remove(category);
		} else {
			throw new NoSuchElementException();
		}

		String remove = "Delete";
		updateCategory(category,remove);

	}*/

}
