package day6.question1;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student>{

	private int roll;
	private String name;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}
	
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks() - o2.getMarks();
	}
	
}
