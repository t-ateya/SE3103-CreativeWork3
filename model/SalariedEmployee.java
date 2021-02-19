package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class SalariedEmployee extends Employee {

	private double baseSalary;
	private static final double BONUS_RATE = 0.05;
	private double bonus;

	public SalariedEmployee(String firstName, String lastName, String id, double baseSalary) {
		super(firstName, lastName, id);
		this.baseSalary = baseSalary;
		this.bonus = BONUS_RATE * baseSalary;

	}

	public double getBaseSalary() {

		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0.0) {
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
	public String toString() {
		return String.format(
				"Salaried and %s\n" +" "+"base Salary : %.2f\n" + " "+"Bonus $: %.2f\n" + " "+"Total Salary $: %.2f\n",
				super.toString(), baseSalary, getBonus(), totalSalary());
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.setFont(new Font("Courier", Font.BOLD, 16));
		int no = 1;
		for (var e : EmployeeDB.getAllemployees()){
			g2.drawString(no + ". " + e, 80, no*50+100);
		}
	}

}
