package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class File01 {

	public static void main(String[] args) {
//		basicDemo();
		
//		createFile("D:\\Training\\IBM-21\\ws\\Java_07_FileIO", "arun.jpg");
		demo2();
		
	}
	
	static void createFile(String path, String filename){
		File file = new File(path+"\\"+filename);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File is created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File is already there");
		}

	}

	private static void basicDemo() {
		File file = new File("D:\\Training\\IBM-21\\ws\\Java_07_FileIO\\abc.txt");
		
		System.out.println("IsDir: "+file.isDirectory());
		System.out.println("IsFile: "+file.isFile());
		System.out.println("IsFile: "+file.exists());
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File is created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File is already there");
		}
		
		System.out.println("IsDir: "+file.isDirectory());
		System.out.println("IsFile: "+file.isFile());
		System.out.println("IsFile: "+file.exists());
		System.out.println();
	}
	
	private static void demo2() {
		File file = new File("D:\\Training\\IBM-21\\ws\\Java_07_FileIO");
//		File file = new File("D:\\Training\\IBM-21\\ws\\Java_07_FileIO\\abc.txt");
		
		System.out.println("IsDir: "+file.isDirectory());
		System.out.println("Dir name: "+file.getName());
		System.out.println("Dir path: "+file.getPath());
		System.out.println("Dir path: "+file.getAbsolutePath());
		System.out.println("files/dirs list: "+Arrays.toString(file.list()));

	}
}
