package ch2;

public class Oper4 {

	public static void main(String[] args) {
		int i1 = 10, i2 = 3;
		// 정수끼리 연산하면 결과도 정수.
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
		System.out.printf("%d - %d = %d\n", i1, i2, i1 - i2);
		System.out.printf("%d * %d = %d\n", i1, i2, i1 * i2);
		System.out.printf("%d / %d = %d\n", i1, i2, i1 / i2);
		// %는 나머지.
		System.out.printf("%d %% %d = %d\n", i1, i2, i1 % i2);
	}

}
