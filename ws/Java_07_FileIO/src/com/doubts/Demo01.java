package com.doubts;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Arun\\Desktop\\Untitled.png");
		 System.out.println("Is Dir : "+file.isDirectory());
	        System.out.println("Is File : "+file.isFile());
	        System.out.println("Is Exist : "+file.exists());
	        if(!file.exists()) {
	            try {
	                file.createNewFile();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	       
	        }
	       
	        System.out.println("Is Dir : "+file.isDirectory());
	        System.out.println("Is File : "+file.isFile());
	        System.out.println("Is Dir : "+file.exists());
	}
}
