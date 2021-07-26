package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product=new Product(3402,"Laptop","HP",45000.00f,new Date(4,10,2019));
		System.out.println("Original product: "+product);
		
		
		try {
			//Shallow copying
			Product clonedProd = (Product) product.clone();
			System.out.println("Cloned product: "+clonedProd);
		
			clonedProd.getMfgDate().setDd(25);
			
			System.out.println("Cloned product: "+clonedProd);
			System.out.println("Original product: "+product);
			
			if(clonedProd==product)
				System.out.println("Single object");
			else
				System.out.println("Different objects");
			
			
			Product cloneClonedProd=(Product) clonedProd.clone();
			System.out.println("Cloned product: "+cloneClonedProd);
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
