package p15.tcpthread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class Test {
	//�����е���һ���߳������ն���ͻ���
	public static void main(String[] args) {
		try {
			//����ServerSocket���󣨲��󶨷������˿ڣ�
			ServerSocket ss = new ServerSocket(9400);
			
			//����accept���� ���տͻ��˵�����			
			while(true) {
				Socket s = ss.accept();
				
				//ʹ�ö��߳�ʹ���������ر��ÿͻ����ܶ�ε��÷�����
				Thread st = new ServerThread(s);
				st.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
