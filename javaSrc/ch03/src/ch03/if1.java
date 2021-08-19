package ch03;

public class if1 {

	public static void main(String[] args) {
		int i1 = -12;
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
