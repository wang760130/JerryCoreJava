package p15.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) {
		try {
			DatagramSocket paper = new DatagramSocket(9600);
			
			//必须大于客户端发送的数据
			byte[] buf=new byte[100];
			DatagramPacket packet = new DatagramPacket(buf,0,buf.length);
			paper.receive(packet);
			
			String str=new String(buf,0,packet.getLength());
			System.out.println(str);

			//向客户端传输数据
			//获取端口号
			int port = packet.getPort();
			//获取IP地址
			InetAddress addr = packet.getAddress();
			
			byte[] date="this is server".getBytes();
			
			DatagramPacket packet2=new DatagramPacket(date,0,date.length,addr,port);
			paper.send(packet2);
			    
			paper.close(); 
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
