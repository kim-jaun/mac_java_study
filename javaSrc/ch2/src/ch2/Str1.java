package ch2;

public class Str1 {
	public static void main(String[] args) {
		String name = "김자운";
		String h1 = " Hi!!";
//		String s1 = ""; 0글자도 해당
		String s2 = new String("대박!");
		System.out.println("name = "+name);
		System.out.println("h1 = "+h1);
		System.out.println("s2 = "+s2);
//		문자열끼리 더하면 글자를 이어 붙인다.
		System.out.println(name + s2);
	}
}
