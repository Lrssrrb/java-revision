package day3.question1;

public class Main {

	public static Person generatePerson(Person person) {
		return person;
		
	}
	
	public static void main(String[] args) {
		Address a1 = new Address("chapdha", "MP", "455227");
		Person p1 = new Person("Lrs", "M", a1);
		Student s1 = new Student("N1", "M", a1, 1, "H", 500,p1);
		Person p = generatePerson(s1);
		System.out.println(p);
		Address a2 = new Address("indore","MP","455227");
		Person p2 = new Person("p2", "F", a2);
		Instructor i = new Instructor("i1", "M", a2, 1, 1000, p2);
		Person P = generatePerson(i);
		System.out.println(P);
	}
}
