package p14.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AllReader {

	/**Java中多种方式读文件
	 * 1、按字节读取文件内容
	 * 2、按字符读取文件内容
	 * 3、按行读取文件内容
	 * 4、随机读取文件内容
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	/**
	 * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。 
	 * @param fileName
	 */
	public static void readFileByBytes(String fileName) {
		File file = new File(fileName);
		InputStream in = null;
		
		// 一次读一个字节  
		try {
			System.out.println("以字节为单位读取文件内容，一次读一个字节："); 
			in = new FileInputStream(file);
			int tempbyte;  
			while((tempbyte=in.read()) != -1){  
				System.out.write(tempbyte); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
//		//一次读多个字节 
//		byte[] tempbytes = new byte[100];  
//		int byteread = 0;  
//		in = new FileInputStream(fileName);  
//		AllReader.showAvailableBytes(in);
	}
	
	public static void readFileChars(String fileName) {
		File file = new File(fileName);
		Reader reader = null;
		try {
			System.out.println("以字符为单位读取文件内容，一次读一个字节：");  
			// 一次读一个字符 
			reader = new InputStreamReader(new FileInputStream(file));
			int tempchar;
			while((tempchar = reader.read()) != -1) {
				//对于windows下，rn这两个字符在一起时，表示一个换行。  
				//但如果这两个字符分开显示时，会换两次行。  
				//因此，屏蔽掉r，或者屏蔽n。否则，将会多出很多空行。  
				if(((char)tempchar) != 'r') {
					System.out.println((char)tempchar);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	
//		try {
//			System.out.println("以字符为单位读取文件内容，一次读多个字节：");  
//			//一次读多个字符  
//			char[] tempchars = new char[30];  
//			int charread = 0; 
//			reader = new InputStreamReader(new FileInputStream(fileName));
//			//读入多个字符到字符数组中，charread为一次读取字符数
//			while((charread = reader.read(tempchars)) != -1) {
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
	
	
}
