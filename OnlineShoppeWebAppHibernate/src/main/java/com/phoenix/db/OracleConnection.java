package com.phoenix.db;

import java.sql.Connection;
import java.sql.SQLException;

public class OracleConnection {
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
		String jdbcDriver="oracle.jdbc.driver.OracleDriver";
		String jdbcUrl="jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser="hr";
		String Password="hr";
		
		return DBConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, Password);
		
	}

}
