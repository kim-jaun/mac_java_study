package ch12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IoeEx1 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		ByteArrayInputStream inPut = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream outPut = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = inPut.read()) != -1) {
			outPut.write(data);
		}
		
		outSrc = outPut.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
	}
}
