package com.phoenix.inner;

public class OuterML {
	
	public void show() {
		int a=10;
		System.out.println(a);
		//Local inner class
		class Inner{
			private int x;
			public Inner() {
				// TODO Auto-generated constructor stub
				x=7000;
			}
			public Inner(int x) {
				super();
				this.x = x;
			}
			public void test() {
				System.out.println("X="+x);
				System.out.println("Method variable a="+a);
			}
		}//end of local class
		
		Inner in = new Inner();
		in.test();
	}//end of method
}//end of class
