package ch11;

import java.util.Vector;
import java.util.Scanner;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // 용량(5)인 객체 생성
		vec.add("1"); vec.add("2"); vec.add("3"); print(vec);
//		vec.trimToSize; print(vec);
		vec.ensureCapacity(6); print(vec);
		vec.setSize(7); print(vec);
		vec.clear(); print(vec);
	}

	private static void print(Vector<String> vec) {
		for(String v : vec) {
			System.out.print(v + "\t");
		}
		System.out.println(vec);
		System.out.println("갯수 : " + vec.size());
		System.out.println("용량 : " + vec.capacity());
	}
	
}
