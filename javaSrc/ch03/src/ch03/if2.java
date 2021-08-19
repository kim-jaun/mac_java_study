package ch03;

public class if2 {
	public static void main(String[] args) {
		// Integer.parseInt 입력된 문자열을 숫자로 변경.
		// args[0] 외부로부터 받은 첫번째 문자.
		int i1 = Integer.parseInt(args[0]);
		if (i1 > 0) { 
			// 중괄호({}) 사용하면 if 범위 지정.
			System.out.println("양수 입니다.");
			System.out.println("양수 : " + i1); 
		} else {
			System.out.println("음수 입니다.");
			System.out.println("음수 : " + i1); 
		}
	}
}
