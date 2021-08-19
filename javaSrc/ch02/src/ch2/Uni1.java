package ch2;

public class Uni1 {
	public static void main(String[] args) {
		//%s 문장열, %d 정수, %c 문자, %f 실수
		//(int) 뒤에 있는 문자를 정수형식으로 변경
		System.out.printf("문자 %c는 %d\n", 'A',(int)'A');
		System.out.printf("문자 %c는 %d\n", 'a',(int)'a');
		System.out.printf("문자 %c는 %d\n", '0',(int)'0');
		System.out.printf("문자 %c는 %d\n", 'A'+1,(int)('A'+1));
	}
}
