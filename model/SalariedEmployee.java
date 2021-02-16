package model;

public class SalariedEmployee extends Employee {

	private double baseSalary;
	private static final double BONUS_RATE = 0.05;
	private double bonus = BONUS_RATE * baseSalary;

	public SalariedEmployee(String firstName, String lastName, String id, double bonus) {
		super(firstName, lastName, id);
		this.bonus = bonus;

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
		+ "base Salary: %.2f", super.toString(), baseSalary);
	}

}
