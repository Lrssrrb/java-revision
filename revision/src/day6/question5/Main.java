package day6.question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of students");
		int n = sc.nextInt();
		List<Student> li= new ArrayList<Student>();
		for(int x=0;x<n;x++) {
			System.out.println("Enter the roll number");
			int roll = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the marks");
			int marks = sc.nextInt();
			Student Sobj = new Student(roll, name, marks);
			li.add(Sobj);
		}
		System.out.println(li);
		
		Stream<Student> p = li.stream();
		Stream<Student> s = p.filter((Student t)->t.getMarks()>800);
		s.forEach((a)-> System.out.println(a));
		sc.close();
	}
}
