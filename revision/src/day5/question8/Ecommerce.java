package day5.question8;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	private List<Product> productList=new ArrayList<>();

	public void addProductToList(Product product) {
		boolean bool = false;
		for (Product pro : productList) {
			if(pro.equals(product)) {
				bool = true;
				pro.setCount(product.getCount());
				System.out.println("Count updated Product already exists");
			}
		}
		if(!bool) {
			productList.add(product);
			System.out.println("Product added successfully");
		}
	}
	
	public List<Product> showAllProduct(){
		return productList;
	}
	
	
	
}
