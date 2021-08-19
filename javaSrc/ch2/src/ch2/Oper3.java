package ch2;

public class Oper3 {

	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
		// i1 = 6
		// 6 * 2 + 3 * 5 = 27 => i2 = 4로 변경.
		int k1 = 2 * ++i1 + 3 * i2--;
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("k1 = " + k1);
		// i1 = 7
		// 5 * 7 + 4 * 4 = 51 => i2 = 3으로 변경.
		int k2 = (2 + 3) * ++i1 + 4 * i2--;
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("k2 = " + k2);
	}

}
