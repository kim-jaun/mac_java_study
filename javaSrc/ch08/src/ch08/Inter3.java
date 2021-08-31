package ch08;

interface E1 {
	void m1();
}

interface E2 extends E1 {
	void m2();
}

interface E3 {
	void m3();
}

interface E4 extends E2, E3 {
}

class E5 implements E4 {
	public void m2() {
		System.out.println("m2");
	}
	public void m1() {
		System.out.println("m1");
	}
	public void m3() {
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
	}
	
}

public class Inter3 {
	public static void main(String[] args) {
		E5 e5 = new E5();
		e5.m1(); e5.m2(); e5.m3(); e5.m4();
	}
}
