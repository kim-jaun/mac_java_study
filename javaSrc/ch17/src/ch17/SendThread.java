package ch17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class SendThread extends Thread {
	Socket client; String name;
	public SendThread(Socket client, String name) {
		this.client = client;	this.name = name;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(client.getOutputStream());
			writer.println(name);
			writer.flush();
			while(true) {
				String str = reader.readLine();
				if (str.equals("bye")) break;
				writer.println(str);
				writer.flush();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
			} catch (IOException e) {}
		}
	}
}
