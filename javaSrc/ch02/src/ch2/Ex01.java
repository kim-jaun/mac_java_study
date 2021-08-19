package ch2;

public class Ex01 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		// int보다 작은 정수는 연산자를 만나면 int형으로 변형되어 연산.
		byte b3 = (byte) (b1 + b2);
		System.out.println("b3 = " + b3);
	}
}
