package ch11;

import java.util.*;

public class CarEx {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Bus());
		cars.add(new Texi());
//		상속 안받은 데이터는 에러 발생
//		cars.add(new FireEngine());
		for(Car car : cars) {
			car.print();
		}
	}
}
