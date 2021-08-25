package ch05;

class A1 {
	static int i1;
	int i2;
	void disp() {
		i1++;
		i2++;
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
	}
}

public class Stat1 {
	public static void main(String[] args) {
		A1 a1 = new A1(); A1 a2 = new A1(); A1 a3 = new A1();
		a1.disp(); a2.disp(); a3.disp();
	}
}
