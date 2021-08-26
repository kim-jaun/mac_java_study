package ch06;

public class Method2 {
	int x = 8;
	static void divide(int x, int y) {
		if (y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.printf("%d / %d = %d\n", x, y, x/y);
	}
	public static void main(String[] args) {
		int k = 7;
		divide(12, 3);
		System.out.println("x = " );
//		사용하는 틀래스명과 실행하는 클래스명이 같으면 생략 가능.
		System.out.println("x = " );
		divide(4, 2);
	}
}
