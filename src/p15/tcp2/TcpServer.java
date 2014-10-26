package p15.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
						
//			System.out.println(br.ready());   false
			/*while(br.ready()) {
				//这样会产生堵塞
				//readLine本身就是以换行作为结束的，读不到换行肯定要阻塞的
				line = br.readLine();
				System.out.println(line);
			}		*/
			String line;
			while(true) {
				line = br.readLine();
				System.out.println("client say: " + line);
			}
			
			//关闭Socket
//			s.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
