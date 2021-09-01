package ch09;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextInt(21));
		System.out.println(ran.nextInt());
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextBoolean());
	}
}
