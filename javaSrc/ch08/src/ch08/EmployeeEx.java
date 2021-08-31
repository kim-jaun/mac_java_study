package ch08;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new SalayEmployee("로제", 2000000);
		emps[1] = new SalayEmployee("강다니엘", 1000000);
		emps[2] = new HourlyEmployee("하니", 100, 800);
		emps[3] = new HourlyEmployee("제시", 100, 2000);
		emps[4] = new HourlyEmployee("상엽", 100, 3000);
		
		for(Employee emp : emps) {
			int pay = emp.computePay();
			int incentive = emp.computeIncentive();
			System.out.println("===" + emp.getName() + "의 급여 명세");
			System.out.println("급여 : " + pay);
			System.out.println("보너스 : " + incentive);
		}
	}
}
