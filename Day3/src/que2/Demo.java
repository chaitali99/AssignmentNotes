package que2;

import java.util.function.*;

public class Demo {

	public static void main(String[] args) {
		Predicate<Integer> p=i-> i>=30;
		System.out.println(p.test(12));
		
		Supplier<String> ss=()->"This is from Lambda Expression";
		System.out.println(ss.get());
		
		Consumer<String> cc=s->System.out.println("Welcome to the Lambda Expression: "+s);
		cc.accept("akshu");
		
		
		Function<Integer,String> f=a->"Welcome to Function Interface"+a;
		System.out.println(f.apply(100));
	}

}
