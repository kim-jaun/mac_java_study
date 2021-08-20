package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		// 구구단 숫자를 받아서 해당하는 구구단을 do를 이용하여 출력.
		System.out.println("보고싶은 구구단은?");
		int num = System.in.read() - '0';
		int i = 1;
		System.out.println("구구단 " + num + "단");
		do {
			System.out.printf("%d * %d = %d\n",num,i, num*i);
			i++;
		}while (i <= 9);
	}
}
