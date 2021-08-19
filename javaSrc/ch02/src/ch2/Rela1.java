package ch2;

public class Rela1 {

	public static void main(String[] args) {
		// 관계(비교) 연산의 결과는 boolean 형식.
		int i1 = 7, i2 = 5;
		boolean b1 = i1 == i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 == i2 : " + b1);
		b1 = i1 != i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 != i2 : " + b1);
		b1 = i1 > i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 > i2 : " + b1);
		b1 = i1 >= i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 >= i2 : " + b1);
		b1 = i1 < i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 < i2 : " + b1);
		b1 = i1 <= i2; // 연산의 마지막에 대입 연산 실행.
		System.out.println("i1 <= i2 : " + b1);
	}

}
