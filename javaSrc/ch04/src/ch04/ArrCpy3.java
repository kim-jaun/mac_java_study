package ch04;

public class ArrCpy3 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88};
		int[] arr2 = new int[arr1.length];
		//				원본	  시작  목표 목표시작 갯수
//		System.arraycopy(arr1, 0, arr2, 0,	 arr1.length);
//		System.arraycopy(arr1, 1, arr2, 0,	 arr1.length - 1);
		System.arraycopy(arr1, 0, arr2, 1,	 arr1.length - 1);
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
