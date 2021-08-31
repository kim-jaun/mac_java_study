package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] c1 = new Car[3];
		c1[0] = new Bus();
		c1[1] = new Taxi();
		c1[2] = new FireEngine();
		
		for(Car c : c1) {
			c.disp();
			c.drive();
			if (c instanceof FireEngine) {
				((FireEngine)c).job();
			}
		}
	}
}
