package ch05;

class Car3 {
//	객체를 생성하지 않고 클래스명.변수명; / 객체명.변수;
	static String color; // 클래스 변수, 정적 변수, 공유
	int displacement;
	void disp() {
		System.out.println("===============");
		System.out.println("color : " + color);
		System.out.println("displacement : " + displacement);
	}
}

public class Car3Ex {
	public static void main(String[] args) {
		Car3.color = "Yellow";
		Car3 c1 = new Car3(); Car3 c2 = new Car3(); Car3 c3 = new Car3();
		c1.displacement = 1000; c2.displacement = 2000; c3.displacement = 3000;
		c1.disp(); c2.disp(); c3.disp();
	}
}
