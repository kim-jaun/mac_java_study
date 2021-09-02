package ch10;

public class money {
	public static void main(String[] args) {
		int[] change = {50000, 10000, 5000, 1000};
		int money = 498000;
		System.out.println("거스름돈 : " + money);
		for(int ch : change) {
			System.out.print(ch +"원 : " + money/ch + "장\t");
			money %= ch;
		}
	}
}
