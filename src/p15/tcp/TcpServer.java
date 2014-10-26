package p15.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		try {
			//创建ServerSocket对象（并绑定端口）
			ServerSocket ss = new ServerSocket(9600);;
			//调用accept方法，接收客户端的数据
			Socket s = ss.accept();
			
			//调用getInputStream方法，接收客户端输出的数据，进行I/O
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream())
			);
			
			//输出客户端传过来的数据
			System.out.println("接受客户端数据：");
			String line = br.readLine();
			System.out.println(line);			
			
			//给客户端传输数据
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.println(line + " form server");
			pw.flush();
			
			//关闭Socket
			s.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
