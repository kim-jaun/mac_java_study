package ch04;

public class Arr1 {
	public static void main(String[] args) {
		int[] score = new int[3];
		score[0] = 70;
		score[1] = 80;
		score[2] = 90;
		// 배열명.length : 배열의 갯수, 배열은 초기값으로 정수는 0, 실수는 0.0, 문자열 null
		System.out.println("배열의 갯수 : " + score.length);
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// 실수 세개의 배열을 생성하고 값을 대입.
		double[] db = {12.5, 3.5, 45.7};
		for(int i = 0; i < db.length; i++) {
			System.out.println("db[" + i + "] = "+ db[i]);
		}
	}
}
