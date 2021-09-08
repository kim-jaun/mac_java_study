package ch12;

class Thread6 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
		System.out.print('-');
	}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Thread6 th1 = new Thread6();
		th1.start();
	}
}
