package ch07;

public class Teacher1 extends Person1 {
	private String subject;
	public  Teacher1(String name, int age, String subject) {
		setName(name); setAge(age); this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	void printSu() {
		print();
		System.out.println("과목 : " + subject);
	}
}
