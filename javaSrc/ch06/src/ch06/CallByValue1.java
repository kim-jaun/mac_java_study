package ch06;

public class CallByValue1 {
	static void add(int x, int y) {
		x += 7;
		y += 7;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	public static void main(String[] args) {
		int x = 10, y = 10;
		add(x, y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
