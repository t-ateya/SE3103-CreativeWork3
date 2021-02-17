package model;

import java.util.ArrayList;

public class EmployeeDB {
	public static final ArrayList<Employee> salariedEmployee = new ArrayList<>();
	public static final ArrayList<Employee> hourlyEmployee = new ArrayList<>();
	public static final ArrayList<Employee> salesEmployee = new ArrayList<>();

	static {
		salariedEmployee.add(new SalesEmployee("Dwayne", "Johnson", "12301", 10000, 0.01));
		salariedEmployee.add(new SalesEmployee("Robert", "De Niro", "12302", 11000, 0.02));
		salariedEmployee.add(new SalesEmployee("Kevin", "Spacy", "12303", 12000, 0.03));
		salariedEmployee.add(new SalesEmployee("Denzel", "Washington", "12304", 13000, 0.04));
		salariedEmployee.add(new SalesEmployee("Russel", "Crowe", "12305", 14000, 0.05));
		salariedEmployee.add(new SalesEmployee("Brad", "Pitt", "12306", 15000, 0.06));
		salariedEmployee.add(new SalesEmployee("Angelina", "Jolie", "12307", 16000, 0.07));
		salariedEmployee.add(new SalesEmployee("Leonardo", "DiCaprio", "12308", 17000, 0.08));
		salariedEmployee.add(new SalesEmployee("Tom", "Cruise", "12309", 18000, 0.09));
		salariedEmployee.add(new SalesEmployee("John", "Travolta", "12310", 19000, 0.10));
		salariedEmployee.add(new SalesEmployee("Arnold", "Schwarzenegger", "12311", 20000, 0.11));
		salariedEmployee.add(new SalesEmployee("Sylvester", "Stallone", "12312", 21000, 0.12));
		salariedEmployee.add(new SalesEmployee("Kate", "Winslet", "12313", 22000, 0.13));
		salariedEmployee.add(new SalesEmployee("Christian", "Bale", "12314", 23000, 0.14));
		salariedEmployee.add(new SalesEmployee("Morgan", "Freeman", "12315", 24000, 0.15));
	}

	static {
		hourlyEmployee.add(new HourlyEmployee("Keenu", "Reeves", "12316", 5000, 0.02, 20));
		hourlyEmployee.add(new HourlyEmployee("Nicolas", "Cage", "12317", 5100, 0.03, 21));
		hourlyEmployee.add(new HourlyEmployee("Hugh", "Jackman", "12318", 5200, 0.04, 22));
		hourlyEmployee.add(new HourlyEmployee("Edward", "Norton", "12319", 5300, 0.05, 23));
		hourlyEmployee.add(new HourlyEmployee("Bruce", "Willis", "12320", 5400, 0.06, 24));
		hourlyEmployee.add(new HourlyEmployee("Tom", "Hanks", "12321", 5500, 0.07, 25));
		hourlyEmployee.add(new HourlyEmployee("Charlize", "Theron", "12322", 5600, 0.08, 26));
		hourlyEmployee.add(new HourlyEmployee("Will", "Smith", "12323", 5700, 0.09, 27));
		hourlyEmployee.add(new HourlyEmployee("Sean", "Connery", "12324", 5800, 0.10, 28));
		hourlyEmployee.add(new HourlyEmployee("Keira", "Knightley", "12325", 5900, 0.11, 29));
		hourlyEmployee.add(new HourlyEmployee("Vin", "Diesel", "12326", 6000, 0.12, 30));
		hourlyEmployee.add(new HourlyEmployee("Matt", "Damon", "12327", 6100, 0.13, 31));
		hourlyEmployee.add(new HourlyEmployee("Richard", "Gere", "12328", 6200, 0.14, 32));
		hourlyEmployee.add(new HourlyEmployee("Catherine", "Zeta-Jones", "12329", 6200, 0.15, 33));
		hourlyEmployee.add(new HourlyEmployee("Clive", "Owen", "12330", 6300, 0.16, 34));
		

	}

	static {
		salesEmployee.add(new SalariedEmployee("Al", "Pacino", "12331", 5000));
		salesEmployee.add(new SalariedEmployee("Mel", "Gibson", "12332", 5100));
		salesEmployee.add(new SalariedEmployee("George", "Clooney", "12333", 5200));
		salesEmployee.add(new SalariedEmployee("Jack", "Nicolson", "12334", 5300));
		salesEmployee.add(new SalariedEmployee("Scarlet", "Johansson", "12335", 5400));
		salesEmployee.add(new SalariedEmployee("Tom", "Hardy", "12336", 5500));
		salesEmployee.add(new SalariedEmployee("Robert", "Downey Jr.", "12337", 5600));
		salesEmployee.add(new SalariedEmployee("Orlando", "Bloom", "12338", 5700));
		salesEmployee.add(new SalariedEmployee("Ian", "McKellen", "12339", 5800));
		salesEmployee.add(new SalariedEmployee("Antonio", "Banderas", "12340", 5900));
		salesEmployee.add(new SalariedEmployee("Guy", "Pearce", "12341", 6000));
		salesEmployee.add(new SalariedEmployee("Samuel", "L.Jackson", "12342", 6100));
		salesEmployee.add(new SalariedEmployee("Sandra", "Bullock", "123343", 6200));
		salesEmployee.add(new SalariedEmployee("Meg", "Ryan", "123344", 6300));
		salesEmployee.add(new SalariedEmployee("Megan", "Fox", "123345", 6400));

	}

	public static ArrayList<Employee> getSalariedemployee() {
		return salariedEmployee;
	}

	public static ArrayList<Employee> getHourlyemployee() {
		return hourlyEmployee;
	}

	public static ArrayList<Employee> getSalesemployee() {
		return salesEmployee;
	}
}
