package ch07;

public class Student1 extends Person1 {
	private String ban;
	public  Student1(String name, int age, String ban) {
		setName(name); setAge(age); this.ban = ban;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	void printSt() {
		print();
		System.out.println("반 : " + ban);
	}
}
