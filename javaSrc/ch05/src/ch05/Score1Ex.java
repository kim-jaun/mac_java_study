package ch05;

public class Score1Ex {
	public static void main(String[] args) {
		Score1 sc1 = new Score1();
		sc1.eng = 90;
		sc1.sum();
		Score1 sc2 = new Score1();
		sc2.kor = 70; sc2.eng = 90; sc2.math = 80;
		Score1 sc3 = new Score1();
		sc3.kor = 40; sc3.math = 88;
		sc2.sum();
		sc3.sum();
	}
}
