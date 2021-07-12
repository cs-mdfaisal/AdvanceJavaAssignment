package com.phoenix.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(120);
		numList.add(150);
		numList.add(90);
		numList.add(20);
		numList.add(120);
		numList.add(100);
		numList.add(400);
		System.out.println("Using for loop");
		//iterating list using for loop
		for(int i=0;i<numList.size();i++) {
			int ele=numList.get(i);
			System.out.println(ele);
		}
		//iterating list using iterator
		System.out.println("Using iterator");
		Iterator<Integer> it=numList.iterator();
		while(it.hasNext()) {
			int ele=it.next();
			System.out.println(ele);
		}
		//iterate using foreach loop
		System.out.println("Using foreach loop");
		for(int ele:numList) {
			System.out.println(ele);
		}
		System.out.println(numList);
		//reverse
		Collections.reverse(numList);
		System.out.println("Reverse list using foreach loop");
		for(int ele:numList) {
			System.out.println(ele);
		}
		//sort
		Collections.sort(numList);
		System.out.println("sorted using foreach loop");
		for(int ele:numList) {
			System.out.println(ele);
		}
		
	}

}
