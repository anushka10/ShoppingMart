package com.example.main;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.CartOperation;
import com.example.dao.CartOperationImpl;
import com.example.model.Cart;
import com.example.model.Category;
import com.example.model.Product;

public class Main {

	public static void main(String[] args) {
		
		/*Category c1 = new Category(1,"Electonics");
		Category c2 = new Category(2,"Food");
		Category c3 = new Category(3,"Cloths");
		Category c4 = new Category(4,"Entertainment");
		Product p1 = new Product("A111", c1, "Mobile", 5000f);
		Product p2 = new Product("A112", c2, "Mobile", 500f);
		Product p3 = new Product("A113", c3, "jam", 50f);
		Product p4 = new Product("A114", c4, "shirt", 550f);
	
		List<Product> productList = new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		//category.setCategory(productList);
		//System.out.println(category.getCategory());	
		
		
		for(Product product: productList){
			System.out.println("=========================================");
			System.out.println("Product Code:" + product.getProductCode());
			System.out.println("Product Name:" + product.getProductName());
			System.out.println("Product Price:" + product.getProductPrice());
			System.out.println("Cat Id :" + product.getCategory().getCategory_id());
			System.out.println("Cat Name :" + product.getCategory().getCategoryName());
		}
		
			
		
		

		Cart myShoppingCart = new Cart("AnuskaCart");
		CartOperation cartOperation = new CartOperationImpl(myShoppingCart);

		cartOperation.addProductToCart(p1, 1);
		cartOperation.addProductToCart(p2, 1);
		cartOperation.addProductToCart(p3, 3);
		cartOperation.addProductToCart(p4, 2);
		//cartOperation.removeProductFromCart(p1, 1);
		System.out.println("ProductList Size "
				+ myShoppingCart.getProductList().size());
		cartOperation.addCategoryToCart(c1);
		cartOperation.addCategoryToCart(c2);
		cartOperation.addCategoryToCart(c3);
		//cartOperation.removeCategoryFromCart(c4);
		System.out.println("Category List Size "+ myShoppingCart.getCategoryList().size());

		// System.out.println("ProductList Size " +
*/		// myShoppingCart.getProductList().size());
	}

}
