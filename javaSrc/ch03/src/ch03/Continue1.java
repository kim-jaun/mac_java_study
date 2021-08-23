package ch03;

public class Continue1 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("반복한다 : "+ i);
//			if (i>3) continue; // continue를 만나면 아래 문장은 실행하지 않는다.
			// continue문은 조건이 존재하는 문장에 작동.
			System.out.println("나두 : " + i);
		}
		int i = 1, sum = 0;
		while(i < 10) {
			sum += i;
			i++;
			// while은 조건으로 간다.
			// do while일 경우에는 do로 간다.
			if (i > 5) {
				System.out.println(i+ "까지 합 : " + sum);
			}
			System.out.println("합계 : "+ sum);
		}
	}
}
