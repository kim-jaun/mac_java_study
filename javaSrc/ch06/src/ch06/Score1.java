package ch06;

class St1 {
	int kor, eng, math;
	public St1(int k, int e, int m) {
		kor = k; eng = e; math = m;
	}
	void prn() {
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum + "\t평균 : " + sum/3);
	}
}

public class Score1 {
	public static void main(String[] args) {
		St1 s1 = new St1(70, 80, 90);
		s1.prn();
		St1 s2 = new St1(77, 88, 99);
		s2.prn();
	}
}
