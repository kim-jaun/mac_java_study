package ch2;

public class Ex04 {
	public static void main(String[] args) {
		char c1 = 'a';
		// char가 연산자를 만나면 int형으로 변경.
		char c2 = (char) (c1 + 1);
		System.out.println("c2 = " + c2);
		// 현재 아스키코드에 1이 증가된 아스키코드 값.
		System.out.println(++c2);
		// char가 연산자를 만나면 int형으로 변경. 
		// 예)
		int i1 = 'B' - 'A';
		System.out.println("i1 = " + i1);
		int i2 = '2' - '0';
		System.out.println("i2 = " + i2);
	}
}
