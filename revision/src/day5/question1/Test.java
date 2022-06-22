package day5.question1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int ex = sc.nextInt();
		
		if(ex > 0) {
			try {
				sc.close();
				throw new Ex();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			try {
				sc.close();
				throw new RunEx();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}