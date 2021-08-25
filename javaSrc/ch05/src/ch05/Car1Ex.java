package ch05;

class Car2 {
	String color;
	int displacement;
	void prn() {
		System.out.println("색깔 : " + color);
		System.out.println("배기량 : " + displacement);
	}
}
public class Car1Ex {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); Car2 c2 = new Car2();
		c1.color = "Rad"; c1.displacement = 2000;
		c2.color = "yellow"; c2.displacement = 1500;
		c1.prn(); c2.prn();
	}
}
