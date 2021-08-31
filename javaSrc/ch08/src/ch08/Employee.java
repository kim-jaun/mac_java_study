package ch08;

public class Employee {
	private String name;
	public final double INCENTIVE_RATE = 0.1;
	Employee(){}
	Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int computePay() {
		return 0;
	}
	public final int computeIncentive() {
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {
			double temp = pay * INCENTIVE_RATE;
			result = (int)temp;
		} else result = 0;
		return result;
	}
}
