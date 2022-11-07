package que3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> city=new ArrayList<>();
		city.add("Amaravti");
		city.add("Yavatmal");
		city.add("Bramhapuri");
		city.add("Achalpur");
		PrintList p1= a->{
			System.out.println(a);
		};
		p1.display(city);
	}
}
