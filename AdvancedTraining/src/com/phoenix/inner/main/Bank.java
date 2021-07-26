package com.phoenix.inner.main;

import com.phoenix.inner.Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating outer class object
		Account ac=new Account(12345663,"Md faisal",10000.00f);
		ac.printDetails();
		
		//creating Inner class object
		Account.Locker ob = ac.new Locker(123,"john");
		ob.unlock();
		ob.keepThings();
		ob.lock();
		
		Account.Locker ob1=ac.new Locker(124,"Sam");
		ob1.unlock();
		ob1.keepThings();
		ob1.lock();
	}

}
