package com.main.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FileListManager extends FileManager{

	@Override
	void write(String path, List<String> list) {
		// TODO �Զ����ɵķ������
		System.out.println("void write(String path, List<String> list)");
		File file = new File(path);
		write(file, list);
	}

	@Override
	void write(File file, List<String> list) {
		// TODO �Զ����ɵķ������
		System.out.println("void write(File file, List<String> list)");
		String str = null;
		try {
			FileWriter fw = new FileWriter(file);
			//д�������ַ�ʱ���������
			BufferedWriter  bw=new BufferedWriter(fw);
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i)+"\r\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	@Override
	List<String> read(String listPath, boolean isList) {
		// TODO �Զ����ɵķ������
		System.out.println("List<String> read(String listPath, boolean isList)");
		File file = new File(listPath);
		return read(file, isList);
	}

	@Override
	List<String> read(File file, boolean isList) {
		// TODO �Զ����ɵķ������
		System.out.println("List<String> read(File file, boolean isList)");
		//Log.v("", "")
		if (!file.exists()) {
			System.err.println("String read(File file, boolean isList) file not exit");
			return null;
		}
		List<String> list = new ArrayList<String>();
		try {
			FileReader fr=new FileReader(file);
	        BufferedReader br=new BufferedReader(fr);
	        String line="";
	        while ((line=br.readLine())!=null) {
	        	 list.add(line);
	        	 System.out.println(line);
	        }
	        br.close();
	        fr.close();
		}
		catch(FileNotFoundException e){
			return null;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	
	
}
