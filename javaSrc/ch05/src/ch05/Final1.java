package ch05;

public class Final1 {
	public static void main(String[] args) {
		final float PI = 3.14f; // final => 데이터값 변경 불가.(대문자 권고)
		int radius = 10;
		System.out.println("원의 넓이 : " + PI * radius * radius);
	}
}
