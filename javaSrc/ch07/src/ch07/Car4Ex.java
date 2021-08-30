package ch07;

public class Car4Ex {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		Bus bus = new Bus();
		Taxi texi = new Taxi();
		Ambulance4 am = new Ambulance4();
		Car4[] car = {c1, bus, texi, am};
		for(Car4 c : car) {
			c.drive();
			if (c instanceof Ambulance4) {
				Ambulance4 am4 = (Ambulance4)c;
				am4.siren();
				((Ambulance4)c).siren();
			}
		}
	}
}
