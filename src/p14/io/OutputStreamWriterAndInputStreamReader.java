package p14.io;
import java.io.*;

public class OutputStreamWriterAndInputStreamReader {
	public static void main(String[] args) throws Exception{
		String testStr = "我非常的爱絮絮";
		
		
		FileOutputStream fos = new FileOutputStream("ISRandOSW.txt");
		OutputStreamWriter OSW = new OutputStreamWriter(fos,"utf-8");
		//将字节流转换成带编码的字符流
		OSW.write(testStr);
		OSW.flush();
		OSW.close();
		
		FileInputStream fis = new FileInputStream("ISRandOSW.txt");
		InputStreamReader ISR = new InputStreamReader(fis,"utf-8");
		int len = 0;
		while((len = ISR.read())!=-1){
			System.out.print((char)len);
		}
		ISR.close();
	}
}
