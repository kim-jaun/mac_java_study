package ch05;

class A2 {
	int var1 = 100;
	static int var2 = 200;
	void prn() { // 일반 메서드는 클래스변수나 인스턴스변수 다 사용.
		System.out.println("var1 = " + var1 + ", var2 = " + var2);
	}
	static void disp() { // 클래스 메서드, 객체를 생성하지 않고 사용가능.
		System.out.println("wow!");
	}
}

public class Stat2 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		a1.prn();
		A2.disp();
	}
}
