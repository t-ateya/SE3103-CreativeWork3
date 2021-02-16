package model;

public class SalariedEmployee extends Employee {

	private double baseSalary;
	private static final double BONUS_RATE = 0.05;
	private double bonus;

	public SalariedEmployee(String firstName, String lastName, String id, double baseSalary) {
		super(firstName, lastName, id);
		this.baseSalary = baseSalary;
		this.bonus = BONUS_RATE*baseSalary;

	}

	
	public double getBaseSalary() {

		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0.0 ){
			this.baseSalary = baseSalary;
		} else {
			throw new IllegalArgumentException("Salary must be greater than 0");
		}
		
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public double totalSalary() {

		return baseSalary + getBonus();
	}

	@Override
	public String toString(){
		return String.format("Salaried and %s\n"
		+ "base Salary : %.2f\n" +"Bonus: %.2f\n"+ 
		"Total Salary : %.2f\n", super.toString(), baseSalary, getBonus(), totalSalary());
	}

}
