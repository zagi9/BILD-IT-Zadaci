package zadaci_07_03_2017;

public class Person {

	private String name;
	private String adress;
	private String phoneNumber;
	private String eMail;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, String adress, String phoneNumber, String eMail) {
		
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEMail() {
		return eMail;
	}
	
	public String toString() {
		
		return "Person: " + getName();
	}
	
}
