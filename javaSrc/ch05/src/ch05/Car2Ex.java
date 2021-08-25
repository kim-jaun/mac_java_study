package ch05;

public class Car2Ex {
	public static void main(String[] args) {
//	    선언 / 객체명 / 객체 생성 || 객체명 - 레퍼런스 변수명
		Car1 c1 = new Car1();
//		객체를 사용하는 방법은 객체명.메서드() 또는 객체명.멤버변수
		c1.changeColor();
		c1.speedUp();
		c1.color = "Rad"; c1.displacement = 1200;
		System.out.println(c1.color);
		System.out.println(c1.displacement);
		Car1 myCar = new Car1();
		System.out.println(myCar.color);
	}
}
