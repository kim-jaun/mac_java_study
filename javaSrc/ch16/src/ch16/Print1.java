package ch16;

import java.util.Date;

public class Print1 {
	public static void main(String[] args) {
		int i = 65;
		float f = 1234.56789f;
		Date date = new Date();
		System.out.printf("문자 %c코드는 %d\n", i, i);
		System.out.printf("%d는 8진수 %o 16진수 %x\n", i, i, i);
		System.out.printf("%3d%5d%5d\n", 100, 90, 80);
		System.out.println();
		System.out.println("123456789012345678901234567890");
		System.out.printf("%s%-5s%5s\n", 123, 123, 123);
		System.out.println();
		System.out.printf("%-8.1f%8.1f%e\n", f, f, f);
		System.out.printf("%TF %TT\n", date, date);
	}
}
