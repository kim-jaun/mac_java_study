package ch03;

import java.io.IOException;

public class Do3 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		// 짝수를 입력 받아서 출력하세요.
		do {
			System.out.println("짝수를 입력하세요.");
			// System.in.red() 한자리 문자 7+enter \r(13)\n(10) 48
			// 7
			num = System.in.read() - '0';
			// 반복하여 데이터를 받을 경우에는 아래의 방법으로 enter처리가 필요.
			System.in.read(); // \r을 처리.
			System.in.read(); // \n을 처리.
		}while(num % 2 != 0);
		System.out.println("짝수 : " + num);
	}
}
