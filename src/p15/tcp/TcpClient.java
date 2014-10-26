package p15.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		try {
			//创建Socket对象（并连接服务器）
//			Socket s = new Socket("127.0.0.1",9000);			
			Socket s = new Socket("localhost",9600);
			
			//调用getOutputStream方法，进行I/O
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			//向服务器发送消息
			pw.println("Hello World");
			pw.println("this is client message");
			//将数据一次性发出去
			pw.flush();	
			
			
			//接收服务器返回的数据
			BufferedReader br=new BufferedReader(  
			         new InputStreamReader(s.getInputStream()));  
			String line=br.readLine();			
			System.out.println("服务器端返回的数据："+line+"  ");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
