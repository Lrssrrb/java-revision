package day5.question8;

public class Main {

	public static void main(String[] args) {
		Ecommerce obj = new Ecommerce();
		
		Product p = new Product("mazza",100,"mango juse",1);
		Product q = new Product("mazza", 100, "mango juse", 5);

		obj.addProductToList(p);
		obj.addProductToList(q);
		
		System.out.println(obj.showAllProduct());
	}
}
