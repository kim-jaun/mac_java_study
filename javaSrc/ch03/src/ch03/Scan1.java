package ch03;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		// 문자만 여러번, 숫자만 여러번, 문자 입력후에 숫자.
		// 숫자 입력 후에 문자를 읽으면 먼저 enter(\r\n)가 읽힘.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String s1 = sc.nextLine();
		System.out.println("입력한 문자 : " + s1);
		String s2 = sc.nextLine();
		System.out.println("입력한 문자 : " + s2);
		String s3 = sc.nextLine();
		System.out.println("입력한 문자 : " + s3);
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 문자 : " + n1);
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 문자 : " + n2);
		sc.close();
	}
}
