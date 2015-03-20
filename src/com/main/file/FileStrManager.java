package com.main.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileStrManager extends FileManager{

	private final String TAG = "FileStrManager";
	
	void write(String path, String str) {
		// TODO 自动生成的方法存根
		System.out.println("void write(String path, String str)");
		File file = new File(path);
		write(file, str);
	}

	void write(File file, String str) {
		// TODO 自动生成的方法存根
		System.out.println("void write(File file, String str)");
		FileWriter fw = null;
        try {
        	fw = new FileWriter(file);  
			fw.write(str,0,str.length());
			fw.flush(); 
			fw.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}    
        
	}

	String read(String path) {
		// TODO 自动生成的方法存根
		System.out.println("String read(String path)");
		File file = new File(path);
		return read(file);
	}

	String read(File file) {
		// TODO 自动生成的方法存根
		System.out.println("String read(File file)");
		if (!file.exists()) {
			System.err.println("String read(File file) file not exit");
			return null;
		}
		String string = null;
		FileReader fr = null;
		int size = -10;
		char[] buf = new char[1024];
		try {
			fr = new FileReader(file);
			size = fr.read(buf, 0, 1024);
			if (size >= 0) {
				string = new String(buf);
			}
			fr.close();
			System.out.println("size" + size + ",string:"+string);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace(); 
		}
		return string;
	}
	
}
