package model;
import java.awt.Graphics2D;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String id;

	public Employee(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public abstract double totalSalary();
	public abstract void render(Graphics2D g2);

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return String.format("employee: %s  %s\n" + ",  " + "id: %s \n", 
		firstName, lastName, id);
	}

}
