package ch12;

class Run1 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {	}
		}
	}
}

public class Runnable1Ex {
	public static void main(String[] args) {
		Run1 r1 = new Run1(); Run1 r2 = new Run1(); Run1 r3 = new Run1();
		Thread th1 = new Thread(r1, "No.1");
		Thread th2 = new Thread(r2, "No.2");
		Thread th3 = new Thread(r3, "No.3");
		th1.start(); th2.start(); th3.start();
	}
}
