package zadaci_07_03_2017;

public class Staff extends Employee {

	private String title;
	
	public Staff() {
		
	}
	
	public Staff(String name) {
		super(name);
	}
	
	public Staff(String name, String adress, String phoneNumber,
			String eMail, double salary, String title) {
		
		super(name, adress, phoneNumber, eMail, salary);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Staff: " + getName();
	}
}
