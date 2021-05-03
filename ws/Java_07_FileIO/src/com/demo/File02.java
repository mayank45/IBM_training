package com.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File02 {

	public static void main(String[] args) throws IOException {
		String file = "demo.txt";
//		byteWriter(file);
//		byteReader(file);
//		charWriter(file);
		charReader(file);
	}
	
	private static void byteWriter(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File(fileName), true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String name = "arun1234";
		System.out.println("Bytes: "+name.getBytes());
		bos.write(name.getBytes());
		
		System.out.println("Data is written in file...");
		
		bos.close();
		fos.close();
	}
	private static void byteReader(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int fileChar = 0;
		
		while((fileChar = bis.read())>=0) {
			char c = (char)fileChar;
			System.out.print(c);
		}

		
		bis.close();
		fis.close();
	}
	private static void charWriter(String filename) throws IOException {
		File file = new File(filename);
		FileWriter fw = new FileWriter(file);
		
		fw.write("this is string from java");
		
		fw.close();
		
	}
	private static void charReader(String filename) throws IOException {
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		
		int ch = 0;
		while((ch = fr.read())!=-1) {
			System.out.print((char)ch);
		}
		
		fr.close();
	}
	
	
}
