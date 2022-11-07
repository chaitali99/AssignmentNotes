package que1;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		Consumer <Student> c=new MyConsumer();
		c.accept(new Student(111,"Akshay",500));
		
		Supplier <Student> s=()->new Student(112,"Chaitali",809);
		System.out.println(s.get());
		
		Function <String,Integer> f=new MyFunction();
		System.out.println(f.apply("123"));	
		
		
		Predicate <Student> p=new MyPredicate();
		
		System.out.println(p.test(new Student(123,"anushka",784)));

	}

}
