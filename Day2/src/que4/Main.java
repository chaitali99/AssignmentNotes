package que4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> p=new ArrayList<>();
		
		p.add(new Product(11,"p0",45,234));
		p.add(new Product(12,"p2",45,500));
		p.add(new Product(13,"p4",45,300));
		p.add(new Product(14,"p6",45,1000));
		p.add(new Product(15,"p3",45,874));

		
		Collections.sort(p,(p1,p2)->p2.getPrice()-p1.getPrice());
		int i=0;
		for(Product a:p) {
			System.out.println("Product: "+(i++));
			System.out.println("Product Id: "+a.getProductId());
			System.out.println("Product Name: "+a.getProductName());
			System.out.println("Product Quantity: "+a.getQuantity());
			System.out.println("Product Price: "+a.getPrice());
			System.out.println("==========================================================");

		}
		
	}

}
