package model;

public class SalesEmployee extends Employee {
	private double sales;
	private double commission;

	public SalesEmployee(String firstName, String lastName, String id, double sales, double commission) {
		super(firstName, lastName, id);
		setSales(sales);
		setCommission(commission);

	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double rate) {
		if ((rate >=0.01) && (rate < 1.0)){
			this.commission = rate;
		} else throw new IllegalArgumentException("Commission must be in the interval in the interval [0.0, 1.0]");
		
	}

	public void setSales(double sales) {
		if (sales >= 0.0){
			this.sales = sales;
		}else throw new IllegalArgumentException("sales must be greater than 0.0");
		
	}

	public double getSales() {
		return sales;
	}

	@Override
	public double totalSalary() {
		return commission*sales;
	}

	public String toString(){
		return String.format("sales employee: %s\n"
		+ "sales: %.2f"
		+ "commission: %.2f", super.toString(), sales, commission);
	}

}
