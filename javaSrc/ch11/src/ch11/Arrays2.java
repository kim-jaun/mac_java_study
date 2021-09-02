package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
	public static void main(String[] args) {
		Integer[] score = {43, 98, 56, 78, 34};
		System.out.println(Arrays.toString(score));
		Arrays.sort(score); // 오름차순
		System.out.println(Arrays.toString(score));
		Arrays.sort(score, Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.toString(score));
		
		String[] name = {"로제", "제니", "유재석", "하니", "영지", "미란"};
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println(Arrays.toString(name));
	}
}
