package com.phoenix.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.db.OracleConnection;

public class ProductDaoImpl implements ProductDao {
private static Connection con;
	static {
		try {
			con=OracleConnection.getOracleConnection();
			System.out.println("Oracle database connection established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public Product getProductbyId(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM product1 WHERE id=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if(rs.next())
		{
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			return product;
		}
		else
			return null;
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM product1";
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Product> products=new ArrayList<Product>();
		while(rs.next())
		{
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			products.add(product);
			
		}
		return products;
	}

	@Override
	public void insert(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO product1 VALUES(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,product.getId());
		stmt.setString(2, product.getName());
		stmt.setString(3, product.getBrand());
		stmt.setFloat(4, product.getPrice());
		int updateCount = stmt.executeUpdate();
		if(updateCount>0)
		
			System.out.println("New Product added successfully");
			
		else
			System.out.println("Sorry! product not added");	
	}
	
	@Override
	public void update(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE  product1 set name=?,brand=?,price=? where id=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,product.getName());
		stmt.setString(2, product.getBrand());
		stmt.setFloat(3, product.getPrice());
		stmt.setInt(4, product.getId());
		int updateCount = stmt.executeUpdate();
		if(updateCount>0)
		
			System.out.println("Product updated successfully");
			
		else
			System.out.println("Sorry! product not updated");	
	
	}

	@Override
	public void delete(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM product1 WHERE id=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,product.getId());
		
		int updateCount = stmt.executeUpdate();
		if(updateCount>0)
		
			System.out.println("Product deleted successfully");
			
		else
			System.out.println("Sorry! product not deleted");	
	
	}

}
