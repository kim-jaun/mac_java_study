package ch11;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		String[] nations = {"미국", "영국", "중국", "대한민국", "일본"};
		Stack<String> stack = new Stack<>();
		for(String nation : nations) {
			stack.push(nation);
		}
		for(String st : stack) {
			System.out.println(st);
		}
		System.out.println("=============");
		while(!stack.isEmpty()) {
//			pop은 데이터를 위에서 하나씩 추출하여 사용하고 제거
			System.out.println(stack.pop());
			
		}
	}
}
