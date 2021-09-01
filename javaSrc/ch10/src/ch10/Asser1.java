package ch10;

import java.util.Scanner;

public class Asser1 {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요");
			a = sc.nextInt();
//			조건이 맞지 않으면 뒤의 에러 메세지 출력
//			ea : enable assertion의 약자
			assert (a < 100 && a >= 0):"점수를 잘못 입력하셨습니다.";
			System.out.println("입력한 점수 : " + a);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
