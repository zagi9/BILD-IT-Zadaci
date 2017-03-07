package zadaci_07_03_2017;

public class Student extends Person{

	public static final String FRESHMAN = "freshman";
	public static final String SOPHMORE = "sophmore";
	public static final String JUNIOR = "junior";
	public static final String SENIOR = "senior";
	private String status;
	
	
	public Student() {
		
	}
	
	public Student(String name) {
		super(name);
	}
	
	public Student(String name, String adress, String phoneNumber,
			String eMail) {
		super(name, adress, phoneNumber, eMail);
	}
	
	/**
	 * Method definise status studenta
	 * @param status
	 */
	public void setClassStatus(String status) {		
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return "Student: " + getName();
	}
	
}
