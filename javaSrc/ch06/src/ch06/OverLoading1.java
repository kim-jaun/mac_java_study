package ch06;

class B1 {
	int add(int x, int y) {
		return x + y;
	}
	double add(double x, double y) {
		return x + y;
	}
}

public class OverLoading1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println(b1.add(7,5));
		System.out.println(b1.add(7.6, 5.4));
	}
}
