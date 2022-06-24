package day6.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

//	private static final Comparator<? super Product> Product = null;

	public static void main(String[] args) {
		List<Product> m = new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int len = sc.nextInt();
		for(int x=0;x<len;x++) {
			System.out.println("Enter the peoduct Id");
			int id = sc.nextInt();
			System.out.println("Enter the peoduct name");
			String name = sc.next();
			System.out.println("Enter the peoduct price");
			Double price = sc.nextDouble();
			Product p = new Product(id, name, price);
			m.add(p);
		}
		System.out.println("enter your choice how you want to sort.\n1.according to the productPrice\n2.according to the productName\n3.according to the productId");
		int choice = sc.nextInt();
		if(choice == 1) {
			m.sort((Product p1 ,Product p2) ->(p1.getProductPriceInt()-p2.getProductPriceInt()));
		}
		else if(choice == 2) {
			Product p = new Product();
			m.sort((Product p1,Product p2) ->p.compareName(p1, p2));
		}
		else {
			m.sort((Product p1 ,Product p2) ->(p1.getProductId()-p2.getProductId()));
		}
		System.out.println(m);
		sc.close();
	}
}
