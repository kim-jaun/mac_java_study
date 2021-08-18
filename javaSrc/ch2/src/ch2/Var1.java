package ch2;

public class Var1 {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 10;
//		int c = 0;
		int a = 5, b = 10, c = 0;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		a = a + 10; // 한번 선언한 변수는 다시 선언할수 없다
		b = b + 10; // 확보된 자리를 사용하겠다는 의미 
		c = a + b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		byte b1 = 500; byte의 범위를 초과
	}
}
