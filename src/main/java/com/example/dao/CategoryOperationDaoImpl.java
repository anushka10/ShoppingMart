package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.model.Product;
import com.example.util.DBConnection;

public class CategoryOperationDaoImpl implements CategoryOperationDao {
	DBConnection dbConnection = new DBConnection();

	public String createNewCategory(String categoryId, String categoryName) {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = dbConnection.getConnection();
			String insertTableSQL = "INSERT INTO Category"
					+ "(category_Id,category_name) VALUES" + "(?,?)";
			pstmt = con.prepareStatement(insertTableSQL);
			pstmt.setString(1, categoryId);
			pstmt.setString(2, categoryName);
			pstmt.execute();
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Unable to added the new category");
			e.printStackTrace();
		} finally {
			try {
				if (null != pstmt)
					pstmt.close();
				if (null != con)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "New Category added successfully";
	}

	public String addProductToCategory(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeProductFromCategory(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProductsByCategoryId(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
