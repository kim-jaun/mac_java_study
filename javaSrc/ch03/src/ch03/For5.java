package ch03;
public class For5 {
	public static void main(String[] args) {
		// 구구단 2단~9단.
		System.out.println("구구단");
		for (int num = 1; num <= 9; num++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %d\t", i, num, num * i);
			}
			System.out.println();
		}
	}
}
