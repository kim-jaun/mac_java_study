package ch17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip?");
		String ip = sc.nextLine();
		System.out.println("전달할 메세지?");
		String msg = sc.nextLine();
		
		DatagramSocket ds = new DatagramSocket();
		InetAddress addr = InetAddress.getByName(ip);
		byte[] bt = msg.getBytes();
		DatagramPacket dp = new DatagramPacket(bt, bt.length, addr, 5007);
		ds.send(dp);
		System.out.println("메세지 전달 완료");
		ds.close();
		sc.close();
	}
}
