package ch05;

public class Arr5 {
	public static void main(String[] args) {
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"아이유", "악뮤", "이하이", "투피엠"};
		int[][] score = {{80, 70, 90}, {70, 90, 90}, {80, 60, 90}, {90, 80, 80}};
		ArrCal ac = new ArrCal("성적표", title, name, score, 44);
		ac.prn();
	}
}
