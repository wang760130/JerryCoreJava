package p14.file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File[] FileList = new File("D://").listFiles();

		for (File list : FileList) {
			System.out.println("文件名：" + list.getName());

		}
	}

}
