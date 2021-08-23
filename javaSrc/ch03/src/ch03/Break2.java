package ch03;

public class Break2 {
	public static void main(String[] args) {
		a:for (int i = 1; i <=10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("대박");
				// if(j > 4) break; 하나의 for문 종료.
				if(j > 4) break a; // label a에해당하는 for문 종료.
			}
			System.out.println("사건 : "+ i);
		}
	}
}
