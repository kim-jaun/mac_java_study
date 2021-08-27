package ch07;

public class Person1Ex {
	public static void main(String[] args) {
		Student1 st1 = new Student1("로제", 27, "TG");
		Student1 st2 = new Student1("제시	", 34, "TG");
		Teacher1 th1 = new Teacher1("유희열", 44, "오라클");
		Teacher1 th2 = new Teacher1("박진영", 44, "JAVA");
		Manager1 ma1 = new Manager1("유재석", 42, "화장실 청소");
		Manager1 ma2 = new Manager1("이상순", 42, "주방");
		st1.printSt(); st2.printSt();
		th1.printSu(); th2.printSu();
		ma1.printMa(); ma2.printMa();
		}
}
