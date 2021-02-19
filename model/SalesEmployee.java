package model;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics2D;

public class SalesEmployee extends Employee {
	private double sales;
	private double commission;
	private double totSalesSalary;

	public SalesEmployee(String firstName, String lastName, String id, double sales, double commission) {
		super(firstName, lastName, id);
		setSales(sales);
		setCommission(commission);
		totSalesSalary = commission * sales;

	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double rate) {
		if ((rate >= 0.01) && (rate < 1.0)) {
			this.commission = rate;
		} else
			throw new IllegalArgumentException("Commission must be in the interval in the interval [0.0, 1.0]");

	}

	public void setSales(double sales) {
		if (sales >= 0.0) {
			this.sales = sales;
		} else
			throw new IllegalArgumentException("sales must be greater than 0.0");

	}

	public double getSales() {
		return sales;
	}

	@Override
	public double totalSalary() {
		return getTotSalesSalary();
	}

	public double getTotSalesSalary() {
		return totSalesSalary;
	}


	/*public String toString() {
		return String.format(
				"Sales Empl: %s\n" + "" +  "sales $: %.2f\n" + " "+"commission: %.2f\n" +" "+ "Tot Sales Salary $: %.2f\n",
				super.toString(), sales, commission, totSalesSalary);
	}*/

	public String toString(){
		return String.format("Sales Employee: %s", super.toString());
	}

	public void render(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.setFont(new Font("Courier", Font.BOLD, 18));
		g2.drawString("1. Sales Employee: " +""+super.toString(), 50, 60);
		g2.drawString("2. Sales $: " + "" +sales, 50, 100);
		g2.drawString(String.format("3. Commission:  %.2f" + "",  commission*100) + " %", 50, 140);
		//g2.drawString("4. Total Sales Salary $: " + "" +totSalesSalary, 50, 180);
		g2.drawString(String.format("4. Total Sales Salary $:  %.2f" + "",  totSalesSalary), 50, 180);
		
	}

	

}
