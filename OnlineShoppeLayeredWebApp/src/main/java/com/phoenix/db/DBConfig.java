package com.phoenix.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	public static Connection getConnection(String jdbcDriver,String jdbcUrl,String dbUser,String dbPassword) throws ClassNotFoundException, SQLException{
	//Sep1 Load jdbc driver
	Class.forName(jdbcDriver);
	System.out.println("jdbc driver loaded");
	return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
	}

}
