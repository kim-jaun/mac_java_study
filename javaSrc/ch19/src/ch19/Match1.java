package ch19;

import java.util.Arrays;

public class Match1 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 6};
//		모두 2의 배수인가 확인하는 방식
		boolean result = Arrays.stream(arr).allMatch(a->a%2==0);
		System.out.println("2의 배수" + result);
//		3의 배수가 1개라도 존재하는지 확인하는 방식
		result = Arrays.stream(arr).anyMatch(a->a%3==0);
		System.out.println("3의 배수" + result);
//		3의 배수가 없는지 확인하는 방식
		result = Arrays.stream(arr).noneMatch(a->a%3==0);
		System.out.println("3의 배수" + result);
	}
}
