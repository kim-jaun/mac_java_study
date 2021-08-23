package ch04;

public class Score1 {
	public static void main(String[] args) {
		int[] score = {85, 90, 75, 100, 95};
		// 총점과 평균.
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/score.length);
	}
}
