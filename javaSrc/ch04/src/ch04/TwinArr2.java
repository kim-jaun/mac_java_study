package ch04;

public class TwinArr2 {
	public static void main(String[] args) {
		// 2행 4열.
		int i[][] = {{1,2,3,4},{11,22,12,23}};
		// 각각의 행과 열 그리고 합계.
		int sum = 0;
		System.out.println("0열\t1열\t2열\t합");
		System.out.println("===============================");
		for(int j = 0; j < i.length; j++) {
			for(int k = 0; k < i[j].length; k++) {
				System.out.print(i[j][k] + "\t");
				sum += i[j][k];
			}
			System.out.println(sum);
			sum = 0;
		}
		System.out.println("===============================");
		for(int[] j : i) {
			for(int k : j) {
				System.out.print(k + "\t");
				sum += k;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
