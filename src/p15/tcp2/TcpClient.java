package p15.tcp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",9600);
			Scanner sc = new Scanner(System.in); 
			
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			
			String info;
			while(true){
				info = sc.nextLine();
				if(info.equals("exit")){
					break;
				}
				pw.println(info);
				pw.flush();
			}
			pw.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
