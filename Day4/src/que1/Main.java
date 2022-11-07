package que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		
		list.add(new Product(111,"Pencil",12000,12));
		list.add(new Product(112,"Pen",12000,10));
		list.add(new Product(132,"Book",12000,9));
		list.add(new Product(123,"lead",123,8));
		list.add(new Product(120,"Register",500,15));

		Stream<Product> s1=list.stream();
		
		Stream<Product> s2=s1.filter(s->s.getQuantity()>10);
		
		System.out.println("Print product list: ");
		list.forEach(s->System.out.println(s));
		
		System.out.println("Print filter list");
		s2.forEach(s->System.out.println(s));
	}

}
