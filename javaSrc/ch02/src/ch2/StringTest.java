package ch2;

public class StringTest {
	public static void main(String[] args) {
		char c1 = '\u0000'; // 공란
		String  str1 = "안녕 ";
		String  str2 = "자바 ";
		String  str3 = "반갑다 ";
		int age = 2007 - 1990 - 1;
		System.out.print(str1+str2+str3);
		System.out.println("나이 : "+age + "살");
		System.out.printf("\n%5d", 16);
		System.out.printf("\n%-5d", 16);
		System.out.printf("\n%05d\n", 16);
		System.out.println(c1);
	}
}
