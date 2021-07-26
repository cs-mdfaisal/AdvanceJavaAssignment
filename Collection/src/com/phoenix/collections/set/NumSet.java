package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numSet = new HashSet<Integer>();
		numSet.add(120);
		numSet.add(150);
		numSet.add(90);
		numSet.add(20);
		numSet.add(120);
		numSet.add(100);
		numSet.add(400);
		
		
		
		//iterating list using iterator
				System.out.println("Using iterator");
				Iterator<Integer> it=numSet.iterator();
				while(it.hasNext()) {
					int ele=it.next();
					System.out.println(ele);

				}
				//iterate using foreach loop
				System.out.println("Using foreach loop");
				for(int ele:numSet) {
					System.out.println(ele);
				}
				System.out.println(numSet);
	}

}
