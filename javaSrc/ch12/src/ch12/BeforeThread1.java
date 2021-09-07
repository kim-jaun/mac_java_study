package ch12;

public class BeforeThread1 extends Thread {
	public BeforeThread1(String title) {
		super(title);
	}
	public void run() {
		System.out.println(getName() + "실행");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	}
		adCar();
	}
//	자동차 명단 만들기
	private void adCar() {
		System.out.println("addCar");
		JoinTest.carList.add("SONATA");
		JoinTest.carList.add("Santafe");
		JoinTest.carList.add("Avante");
		JoinTest.carList.add("Benz");
	}
}
