package ch12;

import javax.swing.JOptionPane;

class Thread4 extends Thread {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {	}
		}
	}
}

public class Input2 {
	public static void main(String[] args) throws InterruptedException {
		Thread4 th1 = new Thread4();
		th1.start();
		String str = JOptionPane.showInputDialog("anything");
		System.out.println("입력한 글 : " + str);
	}
}
