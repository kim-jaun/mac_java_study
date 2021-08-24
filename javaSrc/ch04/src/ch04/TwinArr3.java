package ch04;

public class TwinArr3 {
	public static void main(String[] args) {
		double d[][] = {{188.8, 166.6}, {179.8, 158.6}};
		double sum = 0.0;
		System.out.println("1열\t2열\t합계\t평균");
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
				sum += d[i][j];
			}
			System.out.println(sum + "\t" + sum/d[i].length);
			sum = 0.0;
		}
		System.out.println("=========================");
		for(double[] d2 : d) {
			for(double d3 : d2) {
				System.out.print(d3 + "\t");
				sum += d3;
			}
			System.out.println(sum + "\t" + sum/d[0].length);
			sum = 0.0;
		}
	}
}
