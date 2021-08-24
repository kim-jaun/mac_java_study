package ch04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		while(true) {
			System.out.println("년도를 입력하세요.");
			year = sc.nextInt();
			if (year == 0) break;
			if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
				System.out.println(year + "는 윤년");
			} else System.out.println(year + "는 평년");
		}
		System.out.println("프로그램 종료.");
		sc.close();
	}
}
