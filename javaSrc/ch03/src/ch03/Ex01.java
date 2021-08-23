package ch03;

public class Ex01 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				j += i;
			}
		}
		System.out.println("합 : " + j);
	}
}
