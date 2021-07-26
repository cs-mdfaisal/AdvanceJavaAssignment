package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array to List conversion
		List<Integer> numList=Arrays.asList(100,600,300,200,800,500);
		numList.forEach(System.out::println);
		//numList.add(120);//unsupported opeartion exception
		//numList.remove(2);//unsupported opeartion exception
		numList.set(2, 2000);
		numList.forEach(System.out::println);
		
		System.out.println("\n");
		//List to array conversion
		Integer [] iArr=new Integer[numList.size()];
		
		iArr=numList.toArray(iArr);
		for(int ele:iArr)
			System.out.println(ele);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
