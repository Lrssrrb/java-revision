package day4.question6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		Pattern pn = Pattern.compile("[a-zA-Z]{3,8}");
		Matcher mn = pn.matcher(name);
		if(!mn.matches()) {
			System.out.println("name should contain only alphabets and length should be min 3 and max 8 Characters.");
		}
		Pattern pm = Pattern.compile("[6-9][0-9]{9}");
		Matcher mm = pm.matcher(mobileNum);
		if(!mm.matches())
			System.out.println("aadharNumber should be numeric and also of length 12.");
		Pattern pa = Pattern.compile("[0-9]{12}");
		Matcher ma = pa.matcher(aadharCard);
		if(!ma.matches())
			System.out.println("mobileNumber should be an Indian mobile number starting with 6,7,8,9 and the length should be 10.");
		return ma.matches() && mn.matches() &&mm.matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your Aadhar card number");
		String aadhar = sc.next();
		System.out.println("Enter your mobile number");
		String mobile = sc.next();
		Demo d = new Demo();
		Boolean b = d.validate(name, mobile, aadhar);
		if(b) {
			Citizen c = new Citizen(name, aadhar, mobile);
			System.out.println(c);
		}
		sc.close();
	}

}
