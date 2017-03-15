package zadaci_15_03_2017;

public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Course course = (Course)super.clone();
		course.students = (String[])(course.clone());
		return course;
	}
}
