package ch06;

class Score3 {
	private String name;
	private int kor;
	Score3(){
		
	}
	Score3(String name, int kor){
		this.name = name; this.kor = kor;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	void prn() {
		System.out.println("name : " + name + ", korean : " + kor);
	}
}

public class Score3Ex {
	public static void main(String[] args) {
		Score3 s1 = new Score3();
		s1.setName("jaun"); s1.setKor(100);
		Score3 s2 = new Score3();
		s2.setName("liry"); s2.setKor(90);
		s1.prn(); s2.prn();
		Score3 s3 = new Score3("lose", 80);
		s3.prn();
	}
}
