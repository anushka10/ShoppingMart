package com.example.dao;

import com.example.model.Category;
import com.example.model.Product;

public interface ProductOperationDao {

	public Product getProductByProductId(String productId);
	public String createNewProduct(String productCode,Category category,String name,float price);
	public String updateProductByProductCode(String productCode,Category category,String name,float price);
}
