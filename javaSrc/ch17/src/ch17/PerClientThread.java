package ch17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<>());
	Socket socket;
	PrintWriter writer;
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void run() {
		String name = null;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("#" + name + "님이 입장하셨습니다.");
			while(true) {
				String str = reader.readLine();
				if (str == null) break;
				sendAll(name + " => " + str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			list.remove(writer);
			sendAll("#" + name + "님이 퇴장하셨습니다.");
			try {
				socket.close();
			} catch (IOException e) {}
		}
	}
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str); // 연결되어 있는 채팅하는 사람들에게 메세지 전달
			writer.flush();
		}
		
	}

}
