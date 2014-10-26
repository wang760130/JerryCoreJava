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
			//����ServerSocket���󣨲��󶨶˿ڣ�
			ServerSocket ss = new ServerSocket(9600);;
			//����accept���������տͻ��˵�����
			Socket s = ss.accept();
			
			//����getInputStream���������տͻ�����������ݣ�����I/O
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream())
			);
			
			//����ͻ��˴�����������
			System.out.println("���ܿͻ������ݣ�");
			String line = br.readLine();
			System.out.println(line);			
			
			//���ͻ��˴�������
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.println(line + " form server");
			pw.flush();
			
			//�ر�Socket
			s.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
