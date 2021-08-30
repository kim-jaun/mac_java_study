package ch07;

public class Car1Ex {
	public static void main(String[] args) {
		Engine eg1 = new Engine(2000, "GDI");
		Engine eg2 = new Engine(3000, "DOHC");
		Car1 c1 = new Car1(eg1, "Rad");
		Car1 c2 = new Car1(eg2, "Green");
		Car1 c3 = new Car1(eg1, "Yellow");
		c1.print(); c2.print(); c3.print();
		System.out.println("=================");
		Car1[] car = {c1, c2, c3};
		for (Car1 c : car) {
			c.print();
		}
	}
}
