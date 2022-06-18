package day4.question7;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int n = sc.nextInt();
			int [] arr = new int[n] ;
			System.out.println("Enter the elements in the array");
			for(int x=0;x<n;x++) {
				arr[x] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int p = sc.nextInt();
			System.out.println("The array element at index "+p+" = "+arr[p]);
			sc.close();

		} catch (NegativeArraySizeException e) {
			System.out.println(e.getClass());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
		}
		catch (Exception e) {
			System.out.println(e.getClass());
		}
	}

}
