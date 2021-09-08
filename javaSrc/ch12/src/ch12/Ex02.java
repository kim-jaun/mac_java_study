package ch12;

class Thread7 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
		System.out.print('-');
	}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Thread7 th1 = new Thread7();
		Thread thread = new Thread(th1);
		thread.start();
	}
}
