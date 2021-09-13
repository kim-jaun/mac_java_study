package ch17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Multiserver {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		ss = new ServerSocket();
		while(true) {
			Socket client = ss.accept();
//			연결된 client를 관리할 객체
			Thread th = new PerClientThread(client);
			th.start();
		}
//		ss.close();
	}
}
