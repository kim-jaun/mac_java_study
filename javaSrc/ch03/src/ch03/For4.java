package ch03;
import java.util.Scanner;
public class For4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 0) break;
			else if (num >=2 && num <= 9) {
				System.out.println("구구단 " + num + "단");
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d\n",num,i, num*i);
				}
			} else System.out.println("구구단 숫자가 아닙니다.");
		}while(true);
		System.out.println("프로그램 종료.");
		sc.close();
	}
}
