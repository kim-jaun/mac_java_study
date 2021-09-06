package ch11;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> kyo = new ArrayList<>();
		List<Integer> cha = new ArrayList<>();
		List<Integer> hap = new ArrayList<>();
		list1.add(1); list1.add(2); list1.add(3); list1.add(4);
		list2.add(3); list2.add(4); list2.add(5); list2.add(6);
		
		kyo.addAll(list1); kyo.retainAll(list2);
		hap.addAll(list1); hap.removeAll(list2); hap.addAll(list2);
		cha.addAll(list1); cha.removeAll(list2);
		System.out.println("교집합 : " + kyo);
		System.out.println("합집합 : " + hap);
		System.out.println("차집합 : " + cha);
	}
}
