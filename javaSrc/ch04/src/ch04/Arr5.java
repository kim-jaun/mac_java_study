package ch04;

public class Arr5 {
	public static void main(String[] args) {
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"아이유", "악뮤", "이하이", "투피엠"};
		int[][] score = {{80, 70, 90}, {70, 90, 90}, {80, 60, 90}, {90, 80, 80}};
		int sum = 0;
		int[] tot = new int[3];
		System.out.println("성적표\n");
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < 44; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t"); // 이름을 출력.
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t"); // 과목별 점수 출력.
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.println(sum + "\t" + sum/score[i].length);
			sum = 0;
		}
		for (int i = 0; i < 44; i++) {System.out.print("-");}
		System.out.print("\n합계\t");
		for(int i = 0; i < tot.length; i++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.println(sum + "\t" + sum/tot.length/name.length);
	}
}
