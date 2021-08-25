package ch05;

public class Score3Ex {
	public static void main(String[] args) {
		Score3 s1 = new Score3();
		Score3 s2 = new Score3();
		Score3 s3 = new Score3();
		s1.name="제니"; s1.kor =90; s1.eng = 88; s1.math = 92;
		s2.name="A"; s1.kor =77; s1.eng = 66; s1.math = 55;
		s3.name="B"; s1.kor =55; s1.eng = 44; s1.math = 92;
		s1.prn();
		s2.prn();
		s3.prn();
	}
}
