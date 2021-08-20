package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i = 1;
		// 조건과 관계없이 한번 실행.
		do {
			System.out.println("hello!");
			i++;
		// 실행후에 조건이 맞으면 계속 실행 맞지 않으면 종료.
		}while(i < 10);
	}
}
