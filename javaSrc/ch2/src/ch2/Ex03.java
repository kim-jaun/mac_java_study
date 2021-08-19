package ch2;

public class Ex03 {
	public static void main(String[] args) {
		// long a = 1000000 * 1000000;
		long a = 1000000 * 1000000L;
		System.out.println("a = " + a);
		// 연산되면 바로 해당하는 데이터형으로 변환.
		int b = 1000000 * 1000000 / 1000000;
		System.out.println("b = " + b);
		int c = 1000000 / 1000000 * 1000000;
		System.out.println("c = " + c);
	}
}
