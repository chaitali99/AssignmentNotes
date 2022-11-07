package que3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(2);
		l.add(54);
		l.add(23);
		l.add(8);
		l.add(9);
		
		Stream<Integer> l1=l.stream();
		Stream<Integer> l2=l1.map(s->{
			return s*s;
		});
		
		List<Integer> modifiedList=l2.collect(Collectors.toList());
		
		modifiedList.forEach(s->{
			System.out.println(s);
		});

		
	}

}
