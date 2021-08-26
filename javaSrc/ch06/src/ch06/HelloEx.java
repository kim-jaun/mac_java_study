package ch06;

public class HelloEx {
	
	public static void main(String[] args) {
		add(10, 7);
		mutiply(10,7);
		minus(10,7);
		String[] name = {"로제", "제니", "아이유", "강다니엘", "유느님"};
		for (int i = 0; i < name.length; i++) {
			hello(name[i]);
		}
	}
	private static void hello(String s) {
		System.out.println("안녕하세요. " + s + "입니다.");
	}
	private static void minus(int i, int j) {
		System.out.printf("%d - %d = %d\n", i, j, i - j);
		
	}
	private static void add(int i, int j) {
		System.out.printf("%d + %d = %d\n", i, j, i + j);
	}
	private static void mutiply(int i, int j) {
		System.out.printf("%d * %d = %d\n", i, j, i * j);
	}
}
