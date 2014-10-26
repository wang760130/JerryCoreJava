package p14.io;

import java.io.*;
/**
 * 字节流输出
 * 传输的数据单位是字节，也意味着字节流能够处理任何一种文件
 * @author JERRY
 *
 */
public class InputStreamTest {

	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("InputStream.txt");
		int len = 0;
		while((len = fin.read()) != -1) {
			System.out.print((char)len + " ");
		}
		System.out.println();
		System.out.println("read end--1\n");
		fin.close();
		
		InputStream fin2 = new FileInputStream("InputStream.txt");
		byte[] bs = new byte[6];
		while((len=fin2.read(bs))!=-1){
			for(int i = 0 ; i < len ; i ++){
				System.out.print((char)bs[i]+" ");
			}
			System.out.println();
		}
		System.out.println("read end--2\n");
		fin2.close();
		
		
		InputStream fin3 = new FileInputStream("InputStream.txt");
		byte[] bs2 = new byte[6];
		while((len=fin3.read(bs2,2,3))!=-1){
			for(int i = 0 ; i < bs2.length ; i ++){
				System.out.print((char)bs2[i]+" ");
			}
			System.out.println();
		}		
		System.out.println("read end--3\n");
		fin3.close();
	}

}
