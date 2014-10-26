package p14.io;
import java.io.*;

public class BufferedStream {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bufferS.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] by = "BufferedOutputStream".getBytes();
		bos.write(by);
		bos.flush();
		fos.close();
		System.out.println("Done");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferS.txt"));
		int len = 0;
		while((len = bis.read())!= -1){
			System.out.print((char)len);
		}
	}
}
