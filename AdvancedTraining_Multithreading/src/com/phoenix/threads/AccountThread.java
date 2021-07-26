package com.phoenix.threads;

import com.phoenix.models.Account;

public class AccountThread extends Thread {

	private Account account;
	private double amount;
	private boolean flag;
	
	public AccountThread() {
		// TODO Auto-generated constructor stub
	}

	public AccountThread(Account account, double amount, boolean flag) {
		super();
		this.account = account;
		this.amount = amount;
		this.flag = flag;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			if(flag==true) 
				account.withdraw(amount);
			else
				account.withdraw(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
