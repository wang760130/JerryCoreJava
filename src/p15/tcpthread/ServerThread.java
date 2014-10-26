package p15.tcpthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	private Socket s;
	public ServerThread(Socket s) {
		this.s = s;
	}
	
	public void run() {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = br.readLine();
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.println(line + " form sever");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
