package ch04;

public class Score2 {
	public static void main(String[] args) {
		int[] score = {88, 99, 77, 66, 55, 78, 87, 45, 88};
		// 확장 for문 사용하여 총점, 평균(실수)
		int sum = 0;
		for (int i : score) { // i에는 88
			sum += i;
		}
		System.out.println("총점 : "+ sum);
//		%.1f 실수 소숫점 1자리.
		System.out.printf("평균 : %.2f",(float)sum/score.length);
	}
}
