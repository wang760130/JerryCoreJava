package p14.io;
import java.io.*;

public class PrintWriterAndFOS {
	public static void main(String[] args)throws Exception {
		String testStr = " 一辈子 ";
		
		Writer fw = new FileWriter("printW.txt",true);//字符流
		FileOutputStream fos = new FileOutputStream("test.txt",true);//字节流
		PrintWriter PW1 = new PrintWriter(fw);
		PrintWriter PW2 = new PrintWriter(fos);//实现桥转换功能
		
		PW1.print(testStr);
		PW1.flush();
		PW1.close();
		
		PW2.println(testStr);
		PW2.flush();
		PW2.close();
		
		System.out.println("PrintWriter Done");

	}

}
