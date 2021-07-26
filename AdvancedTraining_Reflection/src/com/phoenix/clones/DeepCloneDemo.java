package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class DeepCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(3402,"Laptop","HP",45000.00f,new Date(4,10,2019));
		System.out.println("Original product: "+product);
		
		
		//Deep copying
		
		
		//get the clone of container object product
		try {
			
			
			Product clonedProd=(Product) product.clone();
			System.out.println("Clone of Product: "+clonedProd);
		
			Date originalMfgDate=product.getMfgDate();
			
			//get clone of contained object Mfg date
			Date clonedMfgDate=(Date) originalMfgDate.clone();
			
			//deep copying
			clonedProd.setMfgDate(clonedMfgDate);
			
			//changing dd of Mfg date of cloned product
			clonedProd.getMfgDate().setDd(25);
			
			System.out.println("Cloned product: "+clonedProd);
			System.out.println("Original product: "+product);
			
			
			
			
			
			
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
