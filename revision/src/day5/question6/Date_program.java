package day5.question6;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Date_program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your date of birth in dd-MM-yyyy format");
		String input = sc.next();
		try {
			String[] in = input.split("-");
			LocalDate date = LocalDate.of(Integer.parseInt(in[2]), Integer.parseInt(in[1]), Integer.parseInt(in[0]));
			int p = (-1)*date.compareTo(LocalDate.now());
//			System.out.println(date.getDayOfMonth()+"  "+date.getMonthValue());
			if(date.getDayOfMonth()==LocalDate.now().getDayOfMonth() && date.getMonthValue()==LocalDate.now().getMonthValue())
			{
				System.out.print("Happy Birthday, ");
			}
			if(p < 0) 
				System.out.println("Date of birth should not be in future.");
			
			else if(p >= 18)
				System.out.println("You are eligible to cast your vote.");
			
			else 
				System.out.println("You are not eligible to cast your vote.");
			
			sc.close();
		} 
		catch (Exception e) {
				System.out.println("Please pass the date in the proper format.");
			}
	}
}
