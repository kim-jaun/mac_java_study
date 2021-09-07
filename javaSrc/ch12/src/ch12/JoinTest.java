package ch12;

import java.util.ArrayList;

public class JoinTest {
	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		BeforeThread1 bt = new BeforeThread1("befor");
		AfterThread1 at = new AfterThread1("after");
		bt.start(); 
		bt.join(); // bt종료 후에 다음 작업을 진행해라
		at.start();
	}
}
