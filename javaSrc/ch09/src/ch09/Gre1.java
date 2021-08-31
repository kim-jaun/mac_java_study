package ch09;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		int year = 0;
		while(true) {
			System.out.println("년도를 입력 하세요.");
			year = sc.nextInt();
			if (year == 0) break;
			if (gc.isLeapYear(year)) System.out.println(year + "는 윤년.");
			else System.out.println(year + "는 평년");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
