package ch06;

public class CallByRef1 {
	static void add(int[] x) {
		x[0] += 7;
		x[1] += 7;
		System.out.println("x[0] = " + x[0]);
		System.out.println("x[1] = " + x[1]);
	}
	public static void main(String[] args) {
		int[] x = { 10, 10 };
		add(x);
		System.out.println("x[0] = " + x[0]);
		System.out.println("x[1] = " + x[1]);
	}
}
