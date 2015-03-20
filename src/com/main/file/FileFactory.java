package com.main.file;

public class FileFactory {
	private FileManager FM = null;
	
	public static final int  FILE_STR_M = 1;
	public static final int  FILE_LIST_M = 2;
	public static final int  FILE_CON_M = 3;
	
	static FileManager createFileManager(int type)
	{
		FileManager FM = null;
		switch (type) {
		case FILE_STR_M:
			FM = new FileStrManager();
			break;
		case FILE_LIST_M:
			FM = new FileListManager();
			break;
		case FILE_CON_M:
			FM = new FileControlManager();
			break;
		default:
			break;
		}
		return FM;
	}
}
