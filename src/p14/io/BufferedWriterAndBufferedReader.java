package p14.io;

import java.io.*;

public class BufferedWriterAndBufferedReader {

	/**创建缓冲区的步骤： 
	 * //创建节点流
	 * FileOutputStream fout = new FileOutputStream("text.txt")
	 * //封装过滤流
	 * BufferedOutputStream bout = new BufferedOutputStream(fout)
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		String testStr = new String("我会好好照顾你\n恩");
		
		Writer fw = null;
		fw = new FileWriter("BufferedWriterAndBufferedReader.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(testStr);
		bw.flush();
		fw.close();
				
			
		Reader fr = null;
		fr = new FileReader("BufferedWriterAndBufferedReader.txt");
		BufferedReader br = new BufferedReader(fr);
		while(br.ready()) {
			System.out.println(br.readLine());//一下读取一行
		}
		fr.close();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	}
}
