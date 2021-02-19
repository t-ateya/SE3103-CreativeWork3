package model;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class HourlyEmployee extends SalesEmployee {
	private double numberOfHoursWorkedPerWeek;
	private static final double HOURLY_RATE = 30.0;

	private double totHourlySalary;

	public HourlyEmployee(String firstName, String lastName, String id, double sales, double commission,
			double numberOfHoursWorkedPerWeek) {
		super(firstName, lastName, id, sales, commission);
		this.numberOfHoursWorkedPerWeek = numberOfHoursWorkedPerWeek;

		totHourlySalary = HOURLY_RATE * numberOfHoursWorkedPerWeek;

	}

	public double getNumberOfHoursWorkedPerWeek() {
		return numberOfHoursWorkedPerWeek;
	}

	public void setNumberOfHoursWorkedPerWeek(double numberOfHoursWorkedPerWeek) {
		if (numberOfHoursWorkedPerWeek >= 0) {
			this.numberOfHoursWorkedPerWeek = numberOfHoursWorkedPerWeek;
		} else {
			throw new IllegalArgumentException("Number of hours must be great than 0");
		}

	}

	@Override
	public double totalSalary() {

		return super.totalSalary() + totHourlySalary;
	}

	/*
	@Override
	public String toString() {
		return String.format(
				"Hourly Empl: %s\n" +" "+ "Weekly Hours $: %.2f\n" +" " + "Rate $: %.2f\n"
						+" "+ "Hourly Salary $: %.2f\n" + " " + "Tot Salary $: %.2f\n",
				super.toString(), numberOfHoursWorkedPerWeek, HOURLY_RATE, totHourlySalary, totalSalary());
	}
	*/

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.setFont(new Font("Courier", Font.BOLD, 20));
		
		g2.drawString("1. Hourly Employee: "+ "" +super.toString(), 50, 60);
		g2.drawString("2. Hours Worked Per Week: "+ ""+ numberOfHoursWorkedPerWeek + "Hours", 50, 100);
		g2.drawString("3. Hourly Rate $: "+ ""+ HOURLY_RATE, 50, 140);
		g2.drawString("4. Total Hourly Salary $: "+ ""+ totHourlySalary, 50, 180);
		g2.drawString("5. Total Salary $: "+ ""+ totalSalary(), 50, 220);
	}

}
