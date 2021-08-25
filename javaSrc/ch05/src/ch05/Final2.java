package ch05;

import java.util.Scanner;

public class Final2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TRIANGLE = 1;
		final int RECTANGLE = 2;
		final int CIRCLE = 3;
		do {
			System.out.println("모형의 종류를 1, 2, 3중에서 입력하세요.");
			int num = sc.nextInt();
			if (num == 0) break;
			else if (num == TRIANGLE) System.out.println("Triangle.");
			else if (num == RECTANGLE) System.out.println("Rectangle.");
			else if (num == CIRCLE) System.out.println("Circle.");
			else System.out.println("Fail.");
		}while(true);
		sc.close();
		System.out.println("Program Exit.");
	}
}
