package ch05;

public class Score3 {
//	private 같은 클래스
//	default 같은 클래스, 같은 패키지
//	protected 같은 클래스, 같은 패키지, 상속 받은 다른 패키지.
//	public 모두
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public void prn() {
		int sum = kor + eng + math;
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t");
		System.out.println(sum + "\t" + sum/3);
	}
}
