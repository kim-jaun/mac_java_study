package ch04;

public class Arr6 {
	public static void main(String[] args) {
		System.out.println("매출 현황\n");
		String[] title = {"제품명", "1월", "2월", "3월", "4월", "합계", "평균"};
		String[] name = {"냉장고", "TV", "청소기"};
		int[][] score = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 230, 400, 250}};
		int sum = 0;
		int[] tot = new int[4];
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < 54; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t"); // 제품명 출력.
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t"); // 제품별 판매량 출력.
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.println(sum + "\t" + sum/score[i].length);
			sum = 0;
		}
		for (int i = 0; i < 54; i++) {System.out.print("-");}
		System.out.print("\n합계\t");
		for(int i = 0; i < tot.length; i++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.println(sum + "\t" + sum/tot.length/name.length);
	}
}
