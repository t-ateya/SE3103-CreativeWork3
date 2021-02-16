package Test;

import model.Employee;
import model.HourlyEmployee;
import model.SalariedEmployee;
import model.SalesEmployee;

public class EmployeeTest {
	public static void main(String[]args){
		SalariedEmployee e1 = new SalariedEmployee("John", "Doe", "1234", 2000);
		//System.out.println(e1.totalSalary());
		//System.out.println(e1.toString());

		HourlyEmployee h1 = new HourlyEmployee("Mohammed", "Ali", "4321", 3000, 0.04, 20.0);
		System.out.println(h1.toString());

		SalesEmployee s1 = new SalesEmployee("Paul", "Rock", "4567", 3000, 0.04);
		//System.out.println(s1.toString());
	}
	
}
