package ch10;
/**
 * 작성자 : 김자운
 * 작성일 : 2021.09.02
 * 내용 : 수업
 */
public class Ex01 {
/*
 * test
 */
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	}

}
