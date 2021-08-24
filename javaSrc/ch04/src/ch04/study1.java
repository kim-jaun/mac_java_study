package ch04;

import java.util.Scanner;

public class study1 {
	public static void main(String[] args) {
		System.out.println("number?");
		Scanner sc = new Scanner(System.in);
		int[] n1 = {Integer.parseInt(sc.nextLine())};
		System.out.println("num"+n1);
		sc.close();
	}
}
