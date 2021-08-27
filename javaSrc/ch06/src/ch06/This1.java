package ch06;

class C1 {
	C1() {
		System.out.println("매개변수 없음.");
	}
	C1(int i) {
		this(); // 생성자를 실행하고 이자로 돌아온다.
		System.out.println("매개변수 1개 i = " + i);
//		this(); this() 생성자의 첫번째 문장에 있어야 한다.
	}
	C1(int i, int j){
		this(i); // this() 같은 클래스 내의 다른 생성자 호출.
		System.out.println("매개변수 2개 i = " + i + ", j = " + j);
	}
}

public class This1 {
	public static void main(String[] args) {
		C1 c1 = new C1(10, 20);
	}
}
