package com.phoenix.threads.main;

import com.phoenix.threads.DataPrinterThread;
import com.phoenix.threads.DataReceiverThread;

public class InterthreadCommDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr=new int[5];
		
		Thread t1=new DataReceiverThread(arr);
		Thread t2=new DataPrinterThread(arr);
		
		t1.start();
		t2.start();
		
		
		
	}

}
