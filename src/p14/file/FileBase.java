package p14.file;

import java.io.File;
import java.io.IOException;


public class FileBase {
	public static void main(String[] args) {
//		File f = new File("test");
		//创建文件夹
//		f.mkdirs();
		
		File f = new File("test.html");
		
		try {
			//创建文件只有当你这个文件不存在时才能创建
			f.createNewFile();		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//文件或者目录的名称
		System.out.println(f.getName());
		//父目录的路径名；如果此路径名没有指定父目录，则返回 null
		System.out.println(f.getParent());
		//文件判断是否存在
		System.out.println(f.exists());
		//判断是否是目录
		System.out.println(f.isDirectory());
		//返回此抽象路径名的绝对路径名字符串
		System.out.println(f.getAbsolutePath());
		//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
		System.out.println(f.list());
		
		//删除文件 / 文件夹
		if(!f.exists()) 
			throw new IllegalArgumentException("删除失败，找不到文件或者文件夹" + f.getName());
		if(!f.canWrite()) 
			throw new IllegalArgumentException("删除失败，文件或者文件夹 " + f.getName() + " 被保护");
		if(f.isDirectory() && f.list().length > 0 )  
			throw new IllegalArgumentException("删除失败，文件夹不为空");
		
//		boolean success = f.delete();
//		if(!success) 
//			throw new IllegalArgumentException("删除失败");
//		else 
//			System.out.println("删除成功");
		
		// 重命名
		f.renameTo(new File("renname.dat"));
	}
}
