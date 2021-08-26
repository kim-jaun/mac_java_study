package ch06;

public class CallByRef3 {
	static void swap(int[] arr) {
		arr[0] = 77;
		arr[1] = 88;
		System.out.println("x[0] = " + arr[0]);
		System.out.println("x[1] = " + arr[1]);
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20 };
		swap(arr);
		System.out.println("x[0] = " + arr[0]);
		System.out.println("x[1] = " + arr[1]);
	}
}
