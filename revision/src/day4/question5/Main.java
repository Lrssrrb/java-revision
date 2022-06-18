package day4.question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter a Paragraph");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split("");
		int n = 0;
		for(int x=0;x<s.length()-3;x++) {
			if(a[x].equals("J") && a[x+1].equals("a") && a[x+2].equals("v") && a[x+3].equals("a")) {
				System.out.println(x+"-------"+(x+4)+"-------Java");
				n++;
			}
		}
		System.out.println("The no of occurrences: "+n);
		sc.close();
	}
}
