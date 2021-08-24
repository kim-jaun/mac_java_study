package ch04;

public class Ex3 {
	public static void main(String[] args) {
		int money = 782000;
		int[] coinUnit = {50000, 10000, 5000, 1000};
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.printf("%d원권  : %d장\n", coinUnit[i], money/coinUnit[i]);
			money = money%coinUnit[i];
		}
	}
}
