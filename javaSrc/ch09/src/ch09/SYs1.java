package ch09;

public class SYs1 {
	public static void main(String[] args) {
		String path = System.getenv("path");
		String java = System.getenv("JAVA_HOME");
		System.out.println(path);
		System.out.println(java);
	}
}
