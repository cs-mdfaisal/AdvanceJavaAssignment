package com.phoenix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> prodList=new ArrayList<Product>();
		prodList.add(new Product(1003,"Laptop","HP",35600.00f));
		prodList.add(new Product(1005,"Refrigerator","Whirlpool",38200.00f));
		prodList.add(new Product(1007,"Mobile","Vivo",17999.00f));
		prodList.add(new Product(1009,"Mobile","Samsung",23800.00f));
		prodList.add(new Product(1001,"LED TV","Sony",57000.00f));
		
		/*
		Stream<Product> prodStream=prodList.stream();
		Stream<Product> filteredStream=prodStream.filter(p->p.getPrice()>20000.00f);
		List<Product> filteredProductList=filteredStream.collect(Collectors.toList());
		filteredProductList.forEach(p->System.out.println(p));
		
		System.out.println("\n");
		*/
		
		//Stream pipeline
		List<Product> products=prodList.stream()
						.filter(p->p.getPrice()>20000.00f)//intermediate
						.collect(Collectors.toList());//terminal
		products.forEach(System.out::println);
		
		/*List<Product> products=new ArrayList<Product>();
		//traditional
		for(Product p:prodList)
			if(p.getPrice()>20000.00)
				//System.out.println(p);
				products.add(p);*/
			
		
		List<Float> prodPrices=prodList.stream()
							.filter(p->p.getPrice()>20000.00f)//intermediate
							.map(product->product.getPrice())//intermediate
							.collect(Collectors.toList());//terminal
		prodPrices.forEach(System.out::println);
		
		
		long prodCount=prodList.stream().count();
		System.out.println("No of products in a list: "+prodCount);
		
		Product prodMaxPrice=prodList.stream()
				.max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
				.get();
		System.out.println("Product having max price: "+prodMaxPrice);
		
		
		Product prodMinPrice=prodList.stream()
				.min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
				.get();
		System.out.println("Product having min price: "+prodMinPrice);
		
		
		float maxPrice=prodList.stream()
				.map(p->p.getPrice())
				.max((price1,price2)->price1>price2?1:-1)
				.get();
		System.out.println("Max price: "+maxPrice);
		
		float minPrice=prodList.stream()
				.map(p->p.getPrice())
				.min((price1,price2)->price1>price2?1:-1)
				.get();
		System.out.println("Min price: "+minPrice);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
