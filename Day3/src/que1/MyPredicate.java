package que1;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		if(t.getMarks()>500) {
			return true;
		}else {
		return false;
		}
	}

}
