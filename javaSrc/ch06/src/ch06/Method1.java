package ch06;

class A1 { // void는 반환하지 않는다. 메서드명 소문자로 시작을 권고.(두단어로 구성시 두번째 단어는 대문자 시작.)
	public void a1() { // 선언부 접근지정자 반환형. 메서드명() { 실행문; ... }
		System.out.println("대박.");
	}
	void a2() {
		System.out.println("사건.");
	}
}

public class Method1 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.a1(); a.a2();
	}
}
