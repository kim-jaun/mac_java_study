package ch06;

class Sc2 {
	int kor = 60, eng = 60, math = 60;
	Sc2() {
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
	}
	Sc2(int kor) {
		this();
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
	}
	Sc2(int kor, int eng){
		this(kor);
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
	}
	Sc2(int kor, int eng, int math){
		this(kor, eng);
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);
	}
}

public class This2 {
	public static void main(String[] args) {
		Sc2 sc4 = new Sc2(90, 96, 89);
	}
}
