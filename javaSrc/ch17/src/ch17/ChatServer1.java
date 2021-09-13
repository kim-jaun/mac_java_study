package ch17;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		try { // ip번호 : 210.178.108.169, 포트번호 : 7001
			ss = new ServerSocket(7001);
			System.out.println("서버 생성 ... 대기중");
			while(true) { // client가 접속할 때까지
				Socket client = ss.accept();
				DataInputStream dis = new DataInputStream(client.getInputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
//				client.getInetAddress() 메세지 보낸사람의 ip + 보낸글을 한줄 읽어서 출력
				System.out.println(client.getInetAddress() + "=>" + br.readLine());
				dis.close();
				br.close();
				client.close();;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
