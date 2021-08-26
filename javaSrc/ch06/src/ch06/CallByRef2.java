package ch06;

class AS2 {
	int x;
	int y;
}

public class CallByRef2 {
	static void swap(AS2 a1) {
		int temp = a1.x; a1.y = a1.x; a1.y = temp;
		System.out.println("x = " + a1.x);
		System.out.println("y = " + a1.y);
	}
	public static void main(String[] args) {
		AS2 a1 = new AS2();
		a1.x = 7; a1.y = 10;
		swap(a1);
		System.out.println("x = " + a1.x);
		System.out.println("y = " + a1.y);
	}
}
