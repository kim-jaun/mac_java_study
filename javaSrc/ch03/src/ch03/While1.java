package ch03;

public class While1 {
	public static void main(String[] args) {
		int i = 0;
		// while(조건) 참이면 실행. 거짓이면 종료.
		while (i < 10) {
		System.out.println("Hello!");
		i++; // 조건을 변경하지 않으면 무한으로 실행.
		}
	}
}
