package model;

public class HourlyEmployee extends SalesEmployee {
	private double numberOfHoursWorkedPerWeek;
	private static final double HOURLY_RATE = 30.0;

	private double totHourlySalary;

	public HourlyEmployee(String firstName, String lastName, String id, double sales, double commission,
			double numberOfHoursWorkedPerWeek) {
		super(firstName, lastName, id, sales, commission);
		this.numberOfHoursWorkedPerWeek = numberOfHoursWorkedPerWeek;

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
		totHourlySalary = HOURLY_RATE*numberOfHoursWorkedPerWeek;
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

}
