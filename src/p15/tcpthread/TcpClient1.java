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
			//����socket����
			Socket s =new Socket("127.0.0.1",9400);
			
			//������getxxxStream����������i/o  ����������������
			PrintWriter pw =new PrintWriter(s.getOutputStream());
			
			//�Զ���������˷�������
			pw.println("Hello world tcpchlient1");
			
			//������һ���Եķ��ͳ�ȥ
			pw.flush();
		    
			//ֻ��һ������   
			BufferedReader br=new BufferedReader( 
					//���շ��������ص�����
			         new InputStreamReader(s.getInputStream()));  
			
			String line=br.readLine();			
			System.out.println("�������˷��ص����ݣ�"+line+"  ");

			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
