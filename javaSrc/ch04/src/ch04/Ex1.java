package ch04;

public class Ex1 {
	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0, tot = 0;
		for (int ar : arr) {
			System.out.print(ar+"\t");
			sum += ar;
		}
		System.out.println("총계 : "+ tot);
	}
}
