package ch03;

public class Continue2 {
	public static void main(String[] args) {
		k:for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("안녕 : " + j);
//				if (j > 3) continue;
//				label k가 있는 증감으로 간다.
				if (j > 3) continue k;
				System.out.println("fool : " + j);
			}
			System.out.println("outside : " + i);
		}
	}
}
