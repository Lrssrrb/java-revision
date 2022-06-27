package day7.question8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roll number of student");
		int roll = sc.nextInt();
		System.out.println("Enter the Name of student");
		String name = sc.next();
		System.out.println("Enter the Email of student");
		String email = sc.next();
		System.out.println("Enter the password of student");
		String password = sc.next();
		System.out.println("Enter the state of student");
		String state = sc.next();
		System.out.println("Enter the city of student");
		String city = sc.next();
		System.out.println("Enter the pincode of student");
		String pincode = sc.next();
		Address add = new Address(state, city, pincode);
		Student std = new Student(roll, name, email, password, add);
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		Student s = (Student)ois.readObject();
		System.out.println(s);
		ois.close();
		sc.close();
	}
}
