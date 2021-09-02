package ch11;

import java.util.LinkedList;

public class Queue1 {
	public static void main(String[] args) {
		String[] pets = {"구렁이", "지렁이", "고슴도치", "애벌레", "굼벵이"};
		LinkedList<String> ques = new LinkedList<>();
		for(String pet:pets) {
			ques.offer(pet);
		}
		while(!ques.isEmpty()) {
			System.out.println(ques.poll());
		}
	}
}
