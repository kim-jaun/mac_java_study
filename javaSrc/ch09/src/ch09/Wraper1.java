package ch09;

public class Wraper1 {
	public static void main(String[] args) {
		char[] obj = {'1','a','#','B'};
		for(int i = 0; i < obj.length; i++) {
			System.out.println("문자 [" + obj[i] + "]:");
			if (Character.isDefined(obj[i])) System.out.println("유니코드");
			if (Character.isDigit(obj[i])) System.out.println("숫자");
			if (Character.isLowerCase(obj[i])) System.out.println("소문자");
			if (Character.isUpperCase(obj[i])) System.out.println("대문자");
			if (Character.isWhitespace(obj[i])) System.out.println("공백");
		}
		Integer i1 = new Integer(1);	// 기존 작성 방법.
		Integer i2 = 2;					// 오토언박싱 된 새롭게 작성하는 방법.
	}
}
