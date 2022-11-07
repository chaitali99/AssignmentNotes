package que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			List<City> city=new ArrayList<>();
			city.add(new City("Mumbai"));
			city.add(new City("Amravti"));
			city.add(new City("Shegaon"));
			city.add(new City("Murtijapur"));
			city.add(new City("Pune"));
			Collections.sort(city,(c1,c2)->c2.getName().compareTo(c1.getName()));
			for(City c:city) {
				System.out.println(c.getName());
			}
	}

}
