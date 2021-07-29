package com.phoenix.interfaces.functional;

public class Message {

	private String msg;
	
	public Message() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	msg="Good mornning";
	}

	public Message(String msg) {
		super();
		this.msg = msg;
		System.out.println("Parameterized constructor");
	}

	public String getMsg() {
		return msg;
	}

	
	
}
