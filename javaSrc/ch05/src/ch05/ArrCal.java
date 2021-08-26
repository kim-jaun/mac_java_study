package ch05;

public class ArrCal {
	String subject; String[] title; String[] name; int[][] score;
	int sum = 0, len = 0; int[] tot;
	public ArrCal(String s, String[] t, String[] n, int[][] sc, int l) {
		subject = s; title = t; name = n; score = sc; len = l;
		tot = new int[score[0].length];
	}
	public void prn() {
		System.out.println(subject + "\n");
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < len; i++) {System.out.print("-");}
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
		for (int i = 0; i < len; i++) {System.out.print("-");}
		System.out.print("\n합계\t");
		for(int i = 0; i < tot.length; i++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.println(sum + "\t" + sum/tot.length/name.length);
	}
}
