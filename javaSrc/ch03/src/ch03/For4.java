package ch03;

public class For4 {
	public static void main(String[] args) {
		// evenSum, oddSum, 총합계 totSum 1~100까지 합계를 구하라.
		int evensum = 0;
		int oddsum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum += i;
			}
			else {
				evensum += i;
			}
		}
		System.out.println("짝수 합계 : " + evensum);
		System.out.println("홀수 합계 : " + oddsum);
		System.out.println("총 합계 : " + (evensum + oddsum));
	}
}
