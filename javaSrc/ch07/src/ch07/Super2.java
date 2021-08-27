package ch07;

class F1 {
	int k1 = 7;
}
class F2 extends F1 {
	int k1 = 17;
}
class F3 extends F2 {
	int k1 = 17;
	void m1() {
		System.out.println(" k = " + super.k1);
	}
}

public class Super2 {
	public static void main(String[] args) {
		F3 f = new F3();
		f.m1();
	}
}
