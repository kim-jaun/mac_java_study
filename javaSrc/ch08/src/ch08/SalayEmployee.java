package ch08;

public class SalayEmployee extends Employee {
	private int annualSalary;
	public SalayEmployee(String name, int annualSalary) {
		super(name); this.annualSalary = annualSalary;
	}
	public int computePay() {
		return annualSalary / 12;
	}
//	computeIncenetive() final메서드는 재정의 안됨.
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
}
