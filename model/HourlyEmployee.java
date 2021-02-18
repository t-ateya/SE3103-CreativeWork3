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

		totHourlySalary = HOURLY_RATE*numberOfHoursWorkedPerWeek;

	}

	public double getNumberOfHoursWorkedPerWeek() {
		return numberOfHoursWorkedPerWeek;
	}

	public void setNumberOfHoursWorkedPerWeek(double numberOfHoursWorkedPerWeek) {
		if (numberOfHoursWorkedPerWeek >= 0){
			this.numberOfHoursWorkedPerWeek = numberOfHoursWorkedPerWeek;
		}else {
			throw new IllegalArgumentException("Number of hours must be great than 0");
		}
		
	}

	@Override
	public double totalSalary() {
		
		return super.totalSalary() + totHourlySalary;
	}

	@Override
	public String toString(){
		return String.format("Hourly employee: %s\n"
		+ "Weekly Hours $: %.2f\n"  
		+"Hourly Rate $: %.2f\n"
		+ "Total Hourly Salary $: %.2f\n"
		+ "Total Salary $: %.2f\n", super.toString(), numberOfHoursWorkedPerWeek,HOURLY_RATE, totHourlySalary, totalSalary());
	}

	@Override
	public void render(Graphics2D g2){
		g2.setColor(Color.red);
		g2.setFont(new Font("Courier", Font.BOLD, 16));
		g2.drawString(
			"Employee First Name: " + getFirstName() + ", \n" + 
			"\tLast Name: " + getLastName() + ", \t" 
			+ "\tID: " + getId(), 50, 100);
	}
	





}
