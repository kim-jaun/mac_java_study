package ch06;

public class CallByValue2 {
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String[] args) {
		int a = 5, b = 7;
		swap(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
