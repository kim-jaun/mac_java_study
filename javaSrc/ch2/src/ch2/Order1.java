package ch2;

public class Order1 {

	public static void main(String[] args) {
		int i1 = 4 + 5 * 2 / 2; // */%를 먼저하고 +-는 나중에 연산.
		System.out.println("i1 = " + i1);
		int i2 = -5 + -2 * 8 / (4 - 2) * 3; // 괄호를 먼저 연산.
		// -5 + -2 * 8 / 2 * 3 => -5 -8 * 3 => -5 - 24 => -29
		System.out.println("i2 = " + i2); 
		int a, b, c;
		a = b = c = 1; // 대입은 뒤부터 연산.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
