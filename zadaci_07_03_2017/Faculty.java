package zadaci_07_03_2017;

public class Faculty extends Employee {

	private int officeHours;
	private String rank;
	
	public Faculty() {
		
	}
	
	public Faculty(String name) {
		super(name);
	}
	
	public Faculty(String name, String adress, String phoneNumber,
			String eMail, double salary, int officeHours, String rank) {
		super(name, adress, phoneNumber, eMail, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public int getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return "Faculty: " + getName();
	}
}
