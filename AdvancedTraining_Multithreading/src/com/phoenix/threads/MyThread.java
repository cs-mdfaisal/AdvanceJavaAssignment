package com.phoenix.threads;

public class MyThread extends Thread {

	
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Current thread: "+Thread.currentThread());
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
	
}
