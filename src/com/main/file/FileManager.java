package com.main.file;

import java.io.File;
import java.util.List;


public class FileManager {
	private final String TAG = "FileManager";
	
	
	void write(String path,String str){
		System.out.println("write(String path,String str)");
	}
	void write(File file,String str){
		System.out.println("write(File file,String str)");
	}
	void write(String path,List<String> list){
		System.out.println("write(File file,String str)");
	}
	void write(File file,List<String> list){
		System.out.println("write(File file,String str)");
	}
	
	String read(String path){
		System.out.println("String read(String path)");
		return null;
	}
	String read(File file){
		System.out.println("String read(File file)");
		return null;
	}
	
	List<String> read(String listPath,boolean isList){
		System.out.println("String read(String path)");
		return null;
	}
	List<String> read(File file,boolean isList){
		System.out.println("String read(String path)");
		return null;
	}
	
	boolean copyFloder(String dest,String from,boolean isCover){
		System.out.println("String read(String path)");
		return false;
	}
	
}
