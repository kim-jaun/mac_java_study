package ch06;

public class CallByValue3 {
	static void multiply(int x, int y) {
		x *= 10;
		y *= 10;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	public static void main(String[] args) {
		int x = 11, y = 20;
		multiply(x, y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
