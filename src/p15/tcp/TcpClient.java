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
			//����Socket���󣨲����ӷ�������
//			Socket s = new Socket("127.0.0.1",9000);			
			Socket s = new Socket("localhost",9600);
			
			//����getOutputStream����������I/O
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			//�������������Ϣ
			pw.println("Hello World");
			pw.println("this is client message");
			//������һ���Է���ȥ
			pw.flush();	
			
			
			//���շ��������ص�����
			BufferedReader br=new BufferedReader(  
			         new InputStreamReader(s.getInputStream()));  
			String line=br.readLine();			
			System.out.println("�������˷��ص����ݣ�"+line+"  ");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
