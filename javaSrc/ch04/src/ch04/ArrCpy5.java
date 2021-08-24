package ch04;

public class ArrCpy5 {
	public static void main(String[] args) {
		int[][] i1 = {{23,45,66},{66,77,88}};
		int[][] i2 = new int[i1.length][i1[0].length];
		for(int i = 0; i < i1.length; i++) {
			System.arraycopy(i1[i], 0, i2[i], 0, i1[i].length);
		}
		for (int[] i3 : i2) {
			for(int i4 : i3) {
				System.out.print(i4 + "\t");
			}
			System.out.println();
		}
	}
}
