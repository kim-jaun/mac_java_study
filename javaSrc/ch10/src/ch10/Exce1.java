package ch10;

public class Exce1 {
	public static void main(String[] args) {
		int num = 100;
		for (int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*10);
			try {
				System.out.printf("%d / %d = %d\n",num,ran,num/ran);
//				ArithmeticException : 0으로 나눌때 발생하는 에러
			}catch (ArithmeticException e) {
				System.out.println("0으로는 나눌수 없습니다.");
			}
			
		}
	}
}
