package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("첫번째 숫자를 입력하세요.");
			int num1 = Integer.parseInt(sc.nextLine());
			if (num1 == 0) break;
			System.out.println("두번째 숫자를 입력하세요.");
			int num2 = sc.nextInt();
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} catch(ArithmeticException e) {
				System.out.println("0은 나눌수 없습니다.");
			} catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다.");
				String k = sc.nextLine();
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
