package ch17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ia1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getByName("www.choongang.co.kr");
		System.out.println("주소 = " + addr.getHostAddress());
		System.out.println("이름 = " + addr.getHostName());
		InetAddress addr2 = InetAddress.getByName("172.30.1.47");
		System.out.println("주소 = " + addr2.getHostAddress());
		System.out.println("이름 = " + addr2.getHostName());
	}
}
