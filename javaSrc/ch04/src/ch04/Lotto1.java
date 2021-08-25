package ch04;


public class Lotto1 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		int temp = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}