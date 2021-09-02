package ch11;

import java.util.Arrays;

public class CopyTest1 {
	public static void main(String[] args) {
		int[] data = {0, 1, 2, 3, 4}; int[] sCopy = null; int[] dCopy = null;
		sCopy = data;
		dCopy = new int[data.length];
		System.arraycopy(sCopy, 0, dCopy, 0, data.length);
		System.out.println("Ori : " + Arrays.toString(data));
		System.out.println("sCopy : " + Arrays.toString(sCopy));
		System.out.println("dCopy : " + Arrays.toString(dCopy));
		data[0] = 77; data[2] = 88;
		System.out.println("Ori : " + Arrays.toString(data));
		System.out.println("sCopy : " + Arrays.toString(sCopy));
		System.out.println("dCopy : " + Arrays.toString(dCopy));
	}
}
