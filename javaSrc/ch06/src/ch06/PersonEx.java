package ch06;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("jaun"); st1.setAge(27); st1.setBan("blackPink");
		Student st2 = new Student();
		st2.setName("sejung"); st2.setAge(17); st2.setBan("gugudan");
		Teacher th1 = new Teacher();
		th1.setName("jjjj"); th1.setAge(51); th1.setSubject("spring");
		Teacher th2 = new Teacher();
		th2.setName("k"); th2.setAge(52); th2.setSubject("java");
		Manager mg1 = new Manager();
		mg1.setName("hem"); mg1.setAge(25); mg1.setPart("cleanner");
		
		st1.printAll(); st2.printAll(); th1.printAll(); th2.printAll();
		mg1.printAll();
	}
}
