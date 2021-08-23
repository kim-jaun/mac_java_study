package ch04;

public class Tot1 {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, max = score[0], min = score[1];
		for(int i : score) {
			sum += i;
			if (i > max) max = i;
			if (i < min) min = i;
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", (float)sum/score.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
