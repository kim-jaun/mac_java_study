package ch07;

public class Manager1 extends Person1 {
	private String part;
	public  Manager1(String name, int age, String part) {
		setName(name); setAge(age); this.part = part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	void printMa() {
		print();
		System.out.println("업무 : " + part);
	}
}
