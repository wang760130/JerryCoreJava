package p14.file;

import java.io.File;

public class SpaceChecker {
	public static void main(String[] args) {
		File[] roots = File.listRoots();

		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
			// 空闲大小
			System.out.println("Free space = " + roots[i].getFreeSpace() + "bytes");
			 // 可用大小
			System.out.println("Usable space = " + roots[i].getUsableSpace() + "bytes");
			// 总共大小
			System.out.println("Total space = " + roots[i].getTotalSpace() + "bytes");
		}
	}
}