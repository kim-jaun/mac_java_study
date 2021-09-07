package ch12;

import java.util.ArrayList;

public class AfterThread1 extends Thread{
	public AfterThread1(String title) {
		super(title);
	}
//	자동차 명단을 가지고 와서 출력
	public void run() {
		System.out.println(getName() + "play");
		ArrayList<String> carList = JoinTest.carList;
		for(String car : carList) {
			System.out.println(car);
		}
	}
}
