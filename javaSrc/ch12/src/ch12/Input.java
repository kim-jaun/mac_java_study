package ch12;

import javax.swing.JOptionPane;

public class Input {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(300);
		}
		String str = JOptionPane.showInputDialog("anything");
		System.out.println("입력한 글 : " + str);
	}
}
