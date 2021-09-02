package ch11;

public class Member2 implements Comparable<Member2>{
	String name;
	int age;
	public Member2(String name, int age) {
		this.name = name; this.age = age;
	}
	public int compareTo(Member2 o) {
		String k1 = age + ""; // 나이를 문자로 변경
		String k2 = o.age + "";
		return k1.compareTo(k2);
//		return name.compareTo(o.name);
	}
	public String toString() {
		return name + " : " + age;
	}
}
