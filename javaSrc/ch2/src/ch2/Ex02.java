package ch2;

public class Ex02 {

	public static void main(String[] args) {
		int i1 = 10000000, i2 = 2000000;
		// int형은 두개의 값을 곱하는 범위보다 작다.
		// long * int => long * long
		long k1 = (long) i1 * i2;
		System.out.println("k1 = " + k1);
	}

}
