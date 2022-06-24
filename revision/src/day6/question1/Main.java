package day6.question1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Main {

	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	
	public static void main(String[] args) {
		HashMap<String, Student> m = new HashMap<String, Student>();
		
		Student a = new Student(1,"A",5);
		m.put("Mp", a);
		
		a = new Student(2,"B",1);
		m.put("Up", a);
		a = new Student(3,"C",3);
		m.put("gujrat", a);
		a = new Student(4,"D",2);
		m.put("Ap", a);
		Collection<Student> cols = m.values();
		List<Student> students = new ArrayList<>(cols);
		students.sort((o1, o2) -> o1.getMarks() - o2.getMarks());
		System.out.println(students);
	}
	
	

}
