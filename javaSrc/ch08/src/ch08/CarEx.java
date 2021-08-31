package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] c1 = new Car[3];
		c1[0] = new Bus();
		c1[1] = new Taxi();
		c1[2] = new FireEngine();
		
		for(int i = 0; i < c1.length; i++) {
			c1[i].disp();
			c1[i].drive();
		}
		c1[2].job();
	}
}
