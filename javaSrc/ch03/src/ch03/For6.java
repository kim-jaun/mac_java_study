package ch03;
public class For6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // 한번 변하면 
			for (int j = 0; j <= i; j++) { // 조건이 맞지 않을 때까지 반복.
										   // i : 0, 1,....4
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
