package zadaci_07_03_2017;

public class TestPerson {
	public static void main(String[] args) {
		
		Person person = new Person("Jenny");
		Person student = new Student("Johnny");
		Person employee = new Employee("Shelly");
		Person faculty = new Faculty("Billy");
		Person staff = new Staff("Boby");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);

	}

}
