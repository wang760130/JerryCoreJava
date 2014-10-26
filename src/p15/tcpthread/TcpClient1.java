package p15.tcpthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient1 {
	public static void main(String[] args) {
		try {
			//创建socket对象
			Socket s =new Socket("127.0.0.1",9400);
			
			//创调用getxxxStream方法，进行i/o  给服务器发送数据
			PrintWriter pw =new PrintWriter(s.getOutputStream());
			
			//自动向服务器端发送数据
			pw.println("Hello world tcpchlient1");
			
			//把数据一次性的发送出去
			pw.flush();
		    
			//只读一行数据   
			BufferedReader br=new BufferedReader( 
					//接收服务器返回的数据
			         new InputStreamReader(s.getInputStream()));  
			
			String line=br.readLine();			
			System.out.println("服务器端返回的数据："+line+"  ");

			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
