package com.pheonix.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
			BufferedReader br =new BufferedReader(new FileReader("hello.txt"));
				
			//BufferedWriter bw=new BufferedWriter(new FileWriter("data2.txt"));
				
			//PrintWriter out=new PrintWriter(bw);	
			
			PrintWriter out=new PrintWriter("data4.txt");
				)
			{
				String line=null;
				while((line=br.readLine())!=null) {
					//bw.write(line);
					//bw.newLine();
					out.println(line);
				}
				System.out.println("Data is copied line by line");
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
	}

}
