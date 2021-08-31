package ch09;

public class String1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		if (s1 == s2) System.out.println("s1 == s2");
		else System.out.println("s1 != s2");
		if (s1 == s3) System.out.println("s1 == s3");
		else System.out.println("s1 != s3");
		
//		문자열은 내용이 같으면 같다고 인식한다.
		if (s1.equals(s2)) System.out.println("s1 == s2");
		else System.out.println("s1 != s2");
		if (s1.equals(s3)) System.out.println("s1 == s3");
		else System.out.println("s1 != s3");
	}
}
