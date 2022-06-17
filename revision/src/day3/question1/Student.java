package day3.question1;

public class Student extends Person{

	private int studentId;
	private String courseEnrolled;
	private int courseFee;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+" address="+super.getAddress() + "]";
	}
	public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee,
			Person person) {
		super(name, gender, address);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
		this.person = person;
	}
	public Student(String name, String gender, Address address) {
		super(name, gender, address);
	}
	
	
	
}
