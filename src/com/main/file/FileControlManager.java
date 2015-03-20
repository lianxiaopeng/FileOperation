package com.main.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileControlManager extends FileManager{

	@Override
	boolean copyFloder(String from, String dest, boolean isCover) {
		// TODO 自动生成的方法存根
		
		try {
			File isfile = new File(from);
			if (!isfile.exists()) {
				return false;
			}
			if (!isfile.isDirectory()) {
				copyFile(isfile, dest);
				return true;
			}
			(new File(dest)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
			File a = new File(from);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (from.endsWith(File.separator)) {
					temp = new File(from + file[i]);
				} else {
					temp = new File(from + File.separator + file[i]);
				}

				if (temp.isFile()) {
					if (isCover || !isFileExist(dest + "/"
							+ (temp.getName()).toString())) {
						copyFile(temp, dest + "/"
								+ (temp.getName()).toString());
					}
				}
				if (temp.isDirectory()) {// 如果是子文件夹
					copyFloder(from + "/" + file[i], dest + "/" + file[i], isCover);
				}
			}
		} catch (Exception e) {
			System.out.println("复制整个文件夹内容操作出错");
			e.printStackTrace();
		}
		return true;
	}
	
	private void copyFile(File file,String str) throws IOException {
		FileInputStream input = new FileInputStream(file);
		FileOutputStream output = new FileOutputStream(str);
		// FileUtils.setPermissions(newPath + "/"
		// +(temp.getName()).toString(), perms, -1, -1);
		byte[] b = new byte[1024 * 5];
		int len;
		while ((len = input.read(b)) != -1) {
			output.write(b, 0, len);
		}
		output.flush();
		output.close();
		input.close();
	}
	
	public boolean isFileExist(String fileName)
	{
		File file = new File(fileName);
		if (file.exists()) {
			return true;
		}
		return false;
	}
	
}
