package ch09;

public class String2 {
	public static void main(String[] args) {
		System.out.println(2 + 0 + 0 + 2 + " worldcup");
		System.out.println("worldcup " + 2 + 0 + 0 + 2);
		System.out.println();
		String str = "대박사건 허곡";
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
