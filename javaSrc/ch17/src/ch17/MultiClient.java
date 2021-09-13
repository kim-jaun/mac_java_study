package ch17;

import java.net.Socket;
import java.util.Scanner;

public class MultiClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 아이피 입력하세요");
		String ip = sc.nextLine();
		System.out.println("사용할 별명");
		String name = sc.nextLine();
		try {
			Socket client = new Socket(ip, 9001);
			Thread send = new SendThread(client, name);
			Thread receive = new ReceiveThread(client);
			send.start();
			receive.start();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
