package ch17;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.GregorianCalendar;

public class TimeServer1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		try {
			while(true) {
				Socket client = ss.accept(); // 클라이언트가 접속하기를 기다리는 중
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
//				접속한 클라이언트에 현재 날짜와 시간을 직렬화해서 보낸다
				oos.writeObject(new GregorianCalendar());
				oos.flush();	// 밀어내다
				os.close(); oos.close(); client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
