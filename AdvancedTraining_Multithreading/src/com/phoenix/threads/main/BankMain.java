package com.phoenix.threads.main;

import com.phoenix.models.Account;
import com.phoenix.threads.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Account account=new Account(12345,"Mr. and Mrs. Rakesh Mehra",10000.00);
	
	Thread t1=new AccountThread(account,3000.00,true);
	t1.setName("Mr. Mehra");
	
	Thread t2=new AccountThread(account,4000.00,false);
	t2.setName("Mrs. Mehra");
		
		
	t1.start();
	t2.start();
	
	
	}

}
