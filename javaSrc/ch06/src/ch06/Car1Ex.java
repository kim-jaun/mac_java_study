package ch06;
class Car1 {
	String color; int displacement;
	public Car1(String color, int displacement) {
		this.color = color; this.displacement = displacement;
	}
	void prn() {
		System.out.println("Car color : " + color);
		System.out.println("Car displacement : " + displacement);
		System.out.println("=======================");
	}
}
public class Car1Ex {
	public static void main(String[] args) {
		Car1 c1 = new Car1("Rad", 2000); Car1 c2 = new Car1("Blue", 1500);
		Car1 c3 = new Car1("Yellow", 2500);
		c1.prn(); c2.prn(); c3.prn();
	}
}
