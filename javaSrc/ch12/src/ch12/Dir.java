package ch12;

import java.io.File;

public class Dir {
	public static void main(String[] args) {
		File dir = new File("./src/ch12");
//		File dir = new File(".");
		String[] strs = dir.list();
		for(String str : strs) {
			System.out.println(str);
		}
	}
}
