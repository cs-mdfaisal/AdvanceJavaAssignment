package com.phoenix.threads.main;

import com.phoenix.threads.MyRunnable;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r=new MyRunnable();
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.setName("john");
		t2.setName("Saraa");
		
		t2.start();
		t1.start();
		
	}

}
