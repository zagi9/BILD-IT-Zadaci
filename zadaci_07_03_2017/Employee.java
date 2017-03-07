package zadaci_07_03_2017;

public class Employee extends Person {
	
	private boolean hasOffice;
	private double salary;
	private MyDate dateHired;
	
	public Employee() {
		
		hasOffice = true;
		dateHired = new MyDate();
	}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, String adress, String phoneNumber,
			String eMail, double salary) {
		super(name, adress, phoneNumber, eMail);
		this.salary = salary;
		hasOffice = true;
		dateHired = new MyDate();
	}
	
	public boolean office() {
		return hasOffice;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}
	
	public String toString() {
		return "Employee: " + getName();
	}

}
