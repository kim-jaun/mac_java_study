package ch12;

class Thread2 extends Thread {
	public Thread2 (String title) {
		super(title);
	}
//	run을 재정의하여 작업
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print(getName() + i + "\t"); // getName 현재 작업하는 쓰레드 명
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {} // 1/1000초 단위
		}
	}
}

public class Thread1Ex2 {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2("th1"); // Thread 명
		Thread2 th2 = new Thread2("th2");
		th1.start(); th2.start(); //th1.run();
		for(int i = 0; i < 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i % 9 == 0) System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}
