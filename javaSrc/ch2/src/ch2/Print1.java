package ch2;

public class Print1 {
	public static void main(String[] args) {
		// 공간 5칸을 확보하고 숫자 16출력.
		System.out.printf("%5d\n", 16);
		// 공간 5칸을 확보하고 숫자 16을 앞에서부터 출력.
		System.out.printf("%-5d\n", 16);
		// 공간 5칸을 확보하고 숫자 16출력하는 빈칸을 0으로 채워라.
		System.out.printf("%05d\n", 16);
		// \r\n은 엔터 \r(13 CR)는 Carriage Return(커서를 맨 앞으로 이동)
		//			 \n(10 LF)은 줄바꿈.
		System.out.printf("%05d\r\n", 16);
	}
}
