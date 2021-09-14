package ch19;

import java.util.ArrayList;
import java.util.List;

public class StreamMember1 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("로제", Member.FEMALE, 25));
		list.add(new Member("원빈", Member.MALE, 42));
		list.add(new Member("하", Member.FEMALE, 29));
		list.add(new Member("공", Member.MALE, 42));
		
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균나이 : " + avg);
		avg = list.stream().filter(m -> m.getGender() == Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("남 평균나이 : " + avg);
		avg = list.stream().filter(m -> m.getGender() == Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("여 평균나이 : " + avg);
	}
}
