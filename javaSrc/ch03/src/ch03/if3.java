package ch03;

public class if3 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if (score >= 90) 
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else grade = "F";
		System.out.println("점수 : " + score + ", 학점 : " + grade);
	}
}
