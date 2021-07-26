package com.phoenix.props;

import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props=new Properties();
		props.setProperty("username", "faisal");
		props.setProperty("password", "123");
		
		
		String uname=props.getProperty("username");
		String pwd=props.getProperty("password","admin");
		
		System.out.println(uname);
		System.out.println(pwd);
		
		
	}

}
