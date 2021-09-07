package ch12;

class Daemon1 extends Thread {
	public void run() {
		while(true) {
			System.out.println("Deamon");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {	}
		}
	}
}

public class Daemon1Ex {
	public static void main(String[] args) {
//		메인 작업이 종료되면 모든 Thread를 종료. start()메서드 실행 전에 setDaemon(true)있어야 한다.
		Daemon1 dm = new Daemon1();
		dm.setDaemon(true);
		dm.start();
		for(int i = 1; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {	}
		}
	}
}
