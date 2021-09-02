package ch11;

public class Member implements Comparable<Member>{
	String name;
	public Member(String name) {
		this.name = name;
	}
//	정열 기준을 설정
	public int compareTo(Member o) {
		return name.compareTo(o.name); // 이름을 기준으로 정열
	}
	public String toString() {
		return name;
	}
}
