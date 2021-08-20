package ch03;

public class Math1 {
	public static void main(String[] args) {
		// 0 ~ 1 사이의 실수.
		double d1 = Math.random();
		int num = (int) (d1 * 20);
		System.out.println(d1);
		System.out.println("num = " + num);
	}
}
