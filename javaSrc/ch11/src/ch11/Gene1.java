package ch11;

import java.util.ArrayList;

public class Gene1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); list.add(2); list.add(3); //list.add("dsfsd");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
