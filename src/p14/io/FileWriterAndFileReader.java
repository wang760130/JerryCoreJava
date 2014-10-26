package p14.io;

import java.io.*;

public class FileWriterAndFileReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String testStr = new String("森俄方".getBytes(),"gbk");
		
		Writer fw = new FileWriter("FileWR.txt");
		fw.write(testStr);
		fw.flush();
		fw.close();
		
		Reader fr = new FileReader("FileWR.txt");
		int len = 0;
		while((len = fr.read())!=-1){
			System.out.print((char)len);
		}
		fr.close();
	}
}
