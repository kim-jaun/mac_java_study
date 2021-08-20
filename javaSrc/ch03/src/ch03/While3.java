package ch03;

import java.io.IOException;

public class While3 {
	public static void main(String[] args) throws IOException {
		System.out.println("정수 한자리를 입력하세요.");
		// System.in.read() console로 부터 한자리 입력을 받는다.
		int num = System.in.read();
		System.out.println("num = " + num);
	}
}