package com.pheonix.fileio;

import java.io.File;
import java.io.IOException;

/*
 * @authors md.faisal
 * @version 1.0
 * @creation date 19-July-2021
 */
public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file=new File("hello.txt");
			System.out.println("File created: "+file.createNewFile());
		
			File dir=new File("MyDir");
			System.out.println("Directory Created: "+dir.mkdir());
		
			File f1=new File(dir, "hello.txt");
			System.out.println("File created: "+f1.createNewFile());
		
			File f2=new File(dir, "Welcome.txt");
			
			System.out.println("Renaming file: "
					+f1.getName() + " to "+
					f2.getName() + ":"+
					f1.renameTo(f2));
		
		
		File f3=new File("Welcome.txt");
		System.out.println("File deleted: "+f3.delete());
			
			
			
			
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
