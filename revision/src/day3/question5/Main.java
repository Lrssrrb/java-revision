package day3.question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numer b/w 1 to 10");
		int input = sc.nextInt();
		while(input <1 || input>10) {
			System.out.println("Invalid number");
			System.out.println("enter a numer b/w 1 to 10");
			input = sc.nextInt();
		}
		Child c = new Child(input);
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		sc.close();
	}
}
