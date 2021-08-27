package ch06;

public class Student {
	private String name;
	private int age;
	private String ban;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	public void printAll() {
		System.out.println("=================");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("class : " + ban);
	}
}
