package p15.tcpthread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class Test {
	//方法中调用一个线程来接收多个客户端
	public static void main(String[] args) {
		try {
			//创建ServerSocket对象（并绑定服务器端口）
			ServerSocket ss = new ServerSocket(9400);
			
			//调用accept方法 接收客户端的数据			
			while(true) {
				Socket s = ss.accept();
				
				//使用多线程使服务器不关闭让客户端能多次调用服务器
				Thread st = new ServerThread(s);
				st.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
