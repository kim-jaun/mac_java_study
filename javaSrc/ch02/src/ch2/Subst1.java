package ch2;

public class Subst1 {

	public static void main(String[] args) {
		int a = 10;
		a += 4; // a = a + 4 => 10 + 4 => 14
		System.out.println("a = " + a);
		a -= 4; // a = a - 4 => 10 - 4 => 10
		System.out.println("a = " + a);
		a *= 4; // a = a * 4 => 10 * 4 => 40
		System.out.println("a = " + a);
		a /= 4; // a = a / 4 => 10 / 4 => 10
		System.out.println("a = " + a);
		a %= 4; // a = a % 4 => 10 % 4 => 2
		System.out.println("a = " + a);
	}

}
