package com.example;

import java.util.NoSuchElementException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.example.dao.CartOperationDao;
import com.example.dao.CartOperationDaoImpl;
import com.example.model.Cart;
import com.example.model.Category;
import com.example.model.Product;

public class TestCartOperation {
	
	private CartOperationDao cartOperation;
	
	@Test
	public void itShouldAddProductToShoppingCart(){
		Category category = new Category("Cat1","Electronics");
		Product p1 = new Product("A111",category,"Mobile", 5000f);
		Cart myShoppingCart = new Cart("AnuskaCart");
		cartOperation = new CartOperationDaoImpl(myShoppingCart);
		cartOperation.addProductToCart(p1,1);
		int expectedSize = 1;
		int actualSize = myShoppingCart.getProductList().size();
		
		org.junit.Assert.assertEquals(expectedSize, actualSize);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void itShouldRemoveProductToShoppingCart(){
		Category category = new Category("Cat1","Electronics");
		Product p1 = new Product("A111",category,"Mobile", 5000f);
		Cart myShoppingCart = new Cart("AnuskaCart");
		cartOperation = new CartOperationDaoImpl(myShoppingCart);
		cartOperation.removeProductFromCart(p1,1);
		int expectedSize = 0;
		int actualSize = myShoppingCart.getProductList().size();
		
		org.junit.Assert.assertEquals(expectedSize, actualSize);
	}
	
}
