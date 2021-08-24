package ch04;

public class TwinArr1 {
	public static void main(String[] args) {
		int[][] i1 = new int[2][3];
		i1[0][0] = 100; i1[0][1] = 200; i1[0][2] = 300;
		i1[1][0] = 400; i1[1][1] = 500; i1[1][2] = 600;
		int sum = 0;
		System.out.println("0열\t1열\t2열\t합");
		System.out.println("===============================");
		for(int i = 0; i < i1.length; i++) { // i1.length 행의 갯수.
			for(int j = 0; j< i1[i].length; j++) { // i1[i].length 열의 갯수.
				System.out.print(i1[i][j] + "\t");
				sum += i1[i][j];
			}
			System.out.println(sum);
			sum = 0;
		}
		System.out.println("===============================");
		for(int[] i2:i1) { // i2에 i1의 0행.
			for(int i3:i2) { // 100,200,300
				System.out.print(i3 + "\t"); // i3에 100, 200, 300이 차례로.
				sum += i3;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
