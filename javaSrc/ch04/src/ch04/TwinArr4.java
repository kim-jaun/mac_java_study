package ch04;

public class TwinArr4 {
	public static void main(String[] args) {
		// 				   0행				1행				2행
		int[][] score = {{100, 90}, {88, 45, 67, 78}, {13, 67, 90}};
		int sum = 0, totalSum = 0;
		for (int i = 0; i < score.length; i ++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				
			}
			System.out.println("합계 : " + sum + "\t평균 : " + sum/score[i].length);
			totalSum += sum;
			sum = 0;
		}
		System.out.println("총합계 : " + totalSum);
	}
}
