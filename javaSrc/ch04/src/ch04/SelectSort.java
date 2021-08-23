package ch04;

public class SelectSort {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1;j < score.length; j++) {
				if (score[i] > score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			for(int k = 0; k < score.length; k++) {
				System.out.print(score[k]+"\t");
			}
			System.out.println();
		}
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"\t");
		}
	}
}
