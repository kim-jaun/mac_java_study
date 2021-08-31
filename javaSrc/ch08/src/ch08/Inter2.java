package ch08;

interface D1 {
	int K = 10;
	void m1();
}

interface D2 extends D1 {	// interface 간에는 extends로 상속 가능.
	void m2();
}

interface D3 {
	void m3();
}

interface D4 extends D2, D3 {	// interface 간에는 extends로 다중 상속 가능.
	void m4();
}

class D5 implements D4 {
	public void m2() {
		System.out.println("m1");
	}
	public void m1() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
	}
	
}

public class Inter2 {
	public static void main(String[] args) {
		D5 d5 = new D5();
		d5.m1(); d5.m2(); d5.m3(); d5.m4();
	}
}
