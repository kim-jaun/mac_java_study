package ch03;

public class if5 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if (score > 100 || score < 0) grade = "점수를 입력하세요.";
		else if (score >= 90) {
			grade = "A";
			if (score >= 95) grade += "+";
			else grade += "0";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) grade += "+";
			else grade += "0";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) grade += "+";
			else grade += "0";
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) grade += "+";
			else grade += "0";
		} else grade = "F";
		System.out.println("점수 : " + score + ", 학점 : " + grade);
	}

}
