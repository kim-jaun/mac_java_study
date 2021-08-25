package ch05;

public class Score1 {
	int kor = 60;
	int eng = 60;
	int math = 60;
	
	void sum() {
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum + "\t평균 : " + sum/3);
	}
}
