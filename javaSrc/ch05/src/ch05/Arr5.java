package ch05;

public class Arr5 {
	public static void main(String[] args) {
		String[] title = {"이름", "국어", "영어", "수학", "과학", "총점", "평균"};
		String[] name = {"아이유", "악뮤", "이하이", "투피엠", "로제"};
		int[][] score = {{80, 70, 90, 88}, {70, 90, 90, 77}, {80, 60, 90, 100}, {90, 80, 80, 98}, {77, 88, 99, 66}};
		ArrCal ac = new ArrCal("성적표", title, name, score, 54);
		ac.prn();
	}
}
