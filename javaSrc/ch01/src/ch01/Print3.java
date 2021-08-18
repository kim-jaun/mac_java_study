package ch01;

public class Print3 {
	public static void main(String[] args) {
		System.out.println(3 + 5); // 3+5 출력후에 줄바꿈
		System.out.printf("3 * 5 = %d\n", 3 * 5); // 3 * 5 = %d의 형식으로 3*5 결과 출력하고 줄바꿈
		System.out.print("안녕 "); // 안녕 출력 이후 줄바꾸지 않고 왜 출
		System.out.print("왜");
	}
}
