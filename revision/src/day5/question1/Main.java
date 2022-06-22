package day5.question1;

public class Main {

	public static void main(String[] args) {
		try {
				//unchecked Exception
			int a = 1;
			System.out.println(a/0);
			
			} catch (java.lang.ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		
				//checked Exception
//			System.out.println(a/"b");
	}

}
