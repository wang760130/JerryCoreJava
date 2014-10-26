package p15.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
						
//			System.out.println(br.ready());   false
			/*while(br.ready()) {
				//�������������
				//readLine��������Ի�����Ϊ�����ģ����������п϶�Ҫ������
				line = br.readLine();
				System.out.println(line);
			}		*/
			String line;
			while(true) {
				line = br.readLine();
				System.out.println("client say: " + line);
			}
			
			//�ر�Socket
//			s.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
