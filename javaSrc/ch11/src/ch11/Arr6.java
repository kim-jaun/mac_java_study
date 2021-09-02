package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Arr6 {
	public static void main(String[] args) {
		String[] fruits = {"산딸기", "집딸기", "뱀딸기", "인삼딸기"};
		ArrayList<String> list = new ArrayList<>();
		for (String fruit : fruits) {
			list.add(fruit);
		}
		prn(list);	list.clear();	prn(list);
		List<String> list2 = Arrays.asList("철수", "길동", "영희", "곱단이");
		for(String str : list2) {
			System.out.print(str + "\t");
		}
	}

	private static void prn(ArrayList<String> list) {
		for(String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
	}
}
