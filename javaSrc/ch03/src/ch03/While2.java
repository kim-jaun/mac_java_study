package ch03;

public class While2 {
	public static void main(String[] args) {
		// 1부터 10까지 합을 구하라.
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i; // sum = sum + i;
			i++;
		}
		System.out.println("합계 : " + sum);
	}
}

