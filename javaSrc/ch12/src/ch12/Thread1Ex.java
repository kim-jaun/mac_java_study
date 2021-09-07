package ch12;

class Thread1 extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("Thread" + i + "\t");
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {} // 1/1000초 단위
		}
	}
}

public class Thread1Ex {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start(); //th1.run();
		for(int i = 0; i < 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}
