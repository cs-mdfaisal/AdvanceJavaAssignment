package com.pheonix.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try-with-resources
		try(FileInputStream fis=new FileInputStream("hello.txt");
				FileOutputStream fos=new FileOutputStream("data.txt",true);//append mode true
				)
				
		{
					//file copying logic
				
			int data=0;
			while((data=fis.read())!=-1)
			fos.write(data);
				
			System.out.println("Data is copied successfully");	
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
