package com.phoenix.inner;
//outer class
public class Outer {
	private int i;
	public Outer() {
		// TODO Auto-generated constructor stub
		i=100;
	}
	public void display() {
		System.out.println("i: "+i);
	}
	//static inner class
	public static class Inner{
		private int j;
		private static int c=5;
		public Inner() {
			// TODO Auto-generated constructor stub
			j=10;
		}
		public Inner(int j) {
			super();
			this.j = j;
		}
		public void show() {
			System.out.println("j: "+j);
		}
		public static void test() {
			System.out.println(c);
		}
	}
}
