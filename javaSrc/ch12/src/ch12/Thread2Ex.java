package ch12;

class Thread3 extends Thread {
//	run을 재정의하여 작업
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.print("WOW!! \t"); // getName 현재 작업하는 쓰레드 명
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {} // 1/1000초 단위
		}
	}
}

public class Thread2Ex {
	public static void main(String[] args) {
		Thread3 th1 = new Thread3(); // Thread 명
		th1.start(); //th1.run();
		for(int i = 0; i < 50; i++) {
			System.out.print("Main WOW!! \t");
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
