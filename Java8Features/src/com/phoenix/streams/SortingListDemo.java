package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList=new ArrayList<Product>();
		prodList.add(new Product(1003,"Laptop","HP",35600.00f));
		prodList.add(new Product(1005,"Refrigerator","Whirlpool",38200.00f));
		prodList.add(new Product(1007,"Mobile","Vivo",17999.00f));
		prodList.add(new Product(1009,"Mobile","Samsung",23800.00f));
		prodList.add(new Product(1001,"LED TV","Sony",57000.00f));
		
		
		//Traditionally sorting
		Collections.sort(prodList);
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		//java8
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\nSorting using stream");
		//Using stream
		prodList.stream()
			.sorted()
			.forEach(System.out::println);
		
		
		System.out.println("\nSorting using stream in desc");
		prodList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
	//Sorting according asc order of product name
		System.out.println("\nSorting according asc order of product name");
		prodList.sort(Comparator.comparing(Product::getName));
		prodList.forEach(System.out::println);
		
		//Sorting according desc order of product name
				System.out.println("\nSorting according desc order of product name");
				prodList.sort(Comparator.comparing(Product::getName).reversed()
						);
				prodList.forEach(System.out::println);	
		
		
				//Sorting according asc order of product brand
				System.out.println("\nSorting according asc order of product brand");
				prodList.stream()
				.sorted(Comparator.comparing(Product::getBrand));
				prodList.forEach(System.out::println);
				
				//Sorting according desc order of product name
						System.out.println("\nSorting according desc order of product brand");
						prodList.stream()
						.sorted(Comparator.comparing(Product::getBrand).reversed()
								);
						prodList.forEach(System.out::println);		
				
				
				
				
				
			//Sorting according asc order of product price
			System.out.println("\nSorting according asc order of product price");
			prodList.stream()
				.sorted(Comparator.comparing(Product::getPrice))
				.forEach(System.out::println);
						
	//Sorting according desc order of product price
			System.out.println("\nSorting according desc order of product price");
			prodList.stream()
				.sorted(Comparator.comparing(Product::getPrice).reversed())
				.forEach(System.out::println);		
				
				
				
				
				
		//Sorting according asc order of product price
		System.out.println("\nSorting according asc order of product name and then brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand))
				.forEach(System.out::println);
				
				
				
		//Sorting according asc order of product price
		System.out.println("\nSorting according desc order of product name and then brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand).reversed())
				.forEach(System.out::println);		
				
		
		
		
		
		
		
		
	}

}
