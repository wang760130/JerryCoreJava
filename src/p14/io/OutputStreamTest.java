package p14.io;

import java.io.*;


public class OutputStreamTest {

	/**
	 * 字节输入流
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException {
		String hello = "hello world \\L w";
		
		byte[] bs = hello.getBytes();
		OutputStream fout = null;		
		fout = new FileOutputStream("OutputStream.txt");
		fout.write('\n');
		fout.write(bs);	
		System.out.println("done");	
		fout.close();

	}
}
