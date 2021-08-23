package ch04;

public class Arr4 {
	public static void main(String[] args) {
		String[] fruits = {"산딸리", "판딸기", "집딸기", "죽은 딸기", "알카리 딸기"};
		// 일반 for문.
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]+ "\t");
		}
		
		// 확장 for문.
		for (String j : fruits) {
			System.out.println(j+ "\t");
		}
		int[] amt = {100, 200, 500, 400, 300};
		// 일반 for문.
		int sum1 = 0, sum2 = 0;
		for (int a = 0; a < amt.length; a++) {
			sum1 += amt[a];
		}
		System.out.println(sum1+ "\t");
		// 확장 for문.
		for (int t : amt) {
			sum2 += t;
		}
		System.out.println(sum2+ "\t");
	}
}
