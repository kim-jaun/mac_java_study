package ch04;

public class ArrCpy1 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88};
		int[] arr2 = arr1;
		arr1[1] = 90;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}
}
