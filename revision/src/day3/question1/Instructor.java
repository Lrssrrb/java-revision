package day3.question1;

public class Instructor extends Person{
	private int instructorId;
	private int salary;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + " address="+super.getAddress() + "]";
	}
	public Instructor(String name, String gender, Address address, int instructorId, int salary, Person person) {
		super(name, gender, address);
		this.instructorId = instructorId;
		this.salary = salary;
		this.person = person;
	}
	public Instructor(String name, String gender, Address address) {
		super(name, gender, address);
	}
	
//	{
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
//				+" address="+super.getAddress() + "]";
//	}
//	public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee,
//			Person person) {
//		super(name, gender, address);
//		this.studentId = studentId;
//		this.courseEnrolled = courseEnrolled;
//		this.courseFee = courseFee;
//		this.person = person;
//	}
//	public Student(String name, String gender, Address address) {
//		super(name, gender, address);
//	}
//	}
}
