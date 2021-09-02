package ch11;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
//		정열후에 dinarySearch 사용하면 인덱스를 가져온다
		int index = Arrays.binarySearch(scores, 99)+1;
		System.out.println("99점의 인덱스 : " + index);
		String[] names = {"철수", "영희", "로제", "산다라박", "수지"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "산다라박") + 1;
		System.out.println("산다라박 인덱스 : " + index);
//		객체 검색
		Member m1 = new Member("로제");
		Member m2 = new Member("영희");
		Member m3 = new Member("철수");
		Member m4 = new Member("수지");
		Member[] member = {m1, m2, m3, m4};
		Arrays.sort(member);
		index = Arrays.binarySearch(member, m1) + 1;
		System.out.println(Arrays.toString(member));
		System.out.println("로제 인덱스 : " + index);
		for(Member m : member) {
			System.out.print(m + "\t");
		}
	}
}
