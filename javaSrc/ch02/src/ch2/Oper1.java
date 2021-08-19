package ch2;

public class Oper1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
		int k1 = ++i1; // 현재의 값의 1 증가하고 연산.
		int k2 = i2++; // 연산 이후 현재의 값의 1 감소.
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("k1 = "+k1);
		System.out.println("k2 = "+k2);
	}
}
