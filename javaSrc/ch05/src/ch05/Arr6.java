package ch05;

public class Arr6 {
	public static void main(String[] args) {
		System.out.println("매출 현황\n");
		String[] title = {"제품명", "1월", "2월", "3월", "4월", "합계", "평균"};
		String[] name = {"냉장고", "TV", "청소기"};
		int[][] score = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 230, 400, 250}};
		ArrCal ac = new ArrCal("매출현황", title, name, score, 54);
		ac.prn();
	}
}
