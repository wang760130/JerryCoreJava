package p14.io;
import java.io.*;

public class DataStream {

	/**
	 * 过滤流的开发步骤 
	 * 			创建节点流	
	 * 			基于节点常见过滤流		
	 * 			读/写数据			
	 * 			关闭外层流
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		DataOutputStream dos = null;		
	
		fos = new FileOutputStream("DataStream.txt");
		dos = new DataOutputStream(fos);
		dos.writeFloat((float)1.23456);
		dos.writeBytes("helloworld DataOutputStream");
		System.out.println("Write Done");
		dos.close();
		fos.close();
		
		
		FileInputStream fis =null;
		DataInputStream dis = null;	
		
		fis = new FileInputStream("DataStream.txt");
		dis = new DataInputStream(fis);
		float fi = dis.readFloat();
		System.out.println(fi);
		int code = 0;
		while((code = dis.read())!=-1)
		{
			System.out.print((char)code);
		}
		dis.close();
		fis.close();			
	}
}


