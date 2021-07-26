package com.phoenix.stacks;

import java.util.Stack;

public class NumStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> numSt = new Stack<Integer>();
		numSt.push(40);
		numSt.push(20);
		numSt.push(70);
		numSt.push(10);
		numSt.push(80);
		numSt.push(20);
		
		System.out.println("Top of numSt: "+numSt.peek());
		int idx = numSt.search(70);
		System.out.println("Element 70 is found at index number: "+idx);
		System.out.println("Pop the top: "+numSt.pop());
		
		while(!numSt.empty()) {
			System.out.println("Popping :"+numSt.pop());
		}
	
	
	
	}

}
