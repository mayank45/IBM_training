package com.doubts;

import java.io.File;

public class DirectoryExplorer {

	public static void main(String[] args) {
		String path = args[0];

		readStructure(path, "");
	}

	private static void readStructure(String path, String tabs) {
		File file = new File(path);
		for (File f : file.listFiles()) {
			if (!f.isDirectory()) {
				System.out.println(tabs + "FILE " + f.getName());
			} else {
				System.out.println(tabs + "DIRECTORY " + f.getName());
				readStructure(path+"\\"+f.getName(), tabs+"--->");
//				System.out.println(path+"\\"+f.getName());
			}
		}
	}
}


