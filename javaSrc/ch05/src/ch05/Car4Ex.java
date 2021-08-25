package ch05;

public class Car4Ex {
	public static void main(String[] args) {
		Car4 car1 = new Car4();
		car1.kind = "Sonata";
		car1.displacement = 2000;
		car1.disp();
		
		Car4 car2 = new Car4("Car4", 3000);
		car2.disp();
	}
}
