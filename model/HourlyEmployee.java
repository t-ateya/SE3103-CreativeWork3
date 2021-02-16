package model;

public class HourlyEmployee extends SalesEmployee {
	private double numberOfHoursWorkedPerWeek;
	private static final double HOURLY_RATE = 30.0;

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
		return super.totalSalary() + HOURLY_RATE*numberOfHoursWorkedPerWeek;
	}

	@Override
	public String toString(){
		return String.format("Hourly employee: %s\n"
		+ "Weekly Hours: %.2f\n"
		, super.toString(), numberOfHoursWorkedPerWeek);
	}

}
