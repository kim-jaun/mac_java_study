package ch10;

public class Exce2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
//			예외가 발생하면 그 문자를 실행하지 않고 catch블럭을 실행한다
			System.out.println(0 / 0);
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException e) {
			System.out.println(5);
			System.out.println(e.getMessage());
		} // try-catch문의 끝
		System.out.println(6);
	}
}
