package ch05;

public class Score2Ex {
	int kor = 60, eng = 60, math = 60; // 전역변수, 멤버변수
	void sum() {
		int sum = kor + eng + math; // sum도 지역변수.
		System.out.println("총점 : " + sum);
	}
	void avg() {
		System.out.println("평균 : " + (kor + eng + math)/3);
	}
	public static void main(String[] args) {
//		지역변소 : 특정한 메서드 안에서 정의된 변수, 그 메서드 안에서만 사용.
//		main메서드는 객체를 생성해서 사용하는 것이 원칙.
		int sci = 80;
		Score2Ex sc1 = new Score2Ex();
		sc1.kor = 90; sc1.eng = 80;
		sc1.sum();
		Score2Ex sc2 = new Score2Ex();
		sc2.kor = 66; sc2.eng = 77; sc2.math = 88;
		sc2.sum();
		System.out.println("과학 : " + sci);
	}
}
