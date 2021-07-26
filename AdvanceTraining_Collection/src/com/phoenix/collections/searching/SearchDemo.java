package com.phoenix.collections.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {50,20,80,40,10,90};
		Arrays.sort(arr);
		System.out.println("Sorted array");
		Arrays.stream(arr).forEach(System.out::println);
		
		
		int searchIdx=Arrays.binarySearch(arr, 5);
		System.out.println("element is found at index no: "+searchIdx);
		
	
		List<Integer> numList = new ArrayList<Integer>();
		 
		
		numList.add(120);
		numList.add(150);
		numList.add(90);
		numList.add(20);
		numList.add(120);
		numList.add(100);
		
		System.out.println("Sorted using collections");
		Collections.sort(numList);
		numList.stream().forEach(System.out::println);
		int searchIdx1=Collections.binarySearch(numList, 90);
		System.out.println("element is found at index no: "+searchIdx1);
		
		
		
		
		
		
		
	}

}
