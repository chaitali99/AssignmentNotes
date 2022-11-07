package que1;

import java.util.function.Supplier;

public class MySupplier implements Supplier<Student>{

	@Override
	public Student get() {
		
		Student s = null;
		return new Student(s.getRoll(),s.getName(),s.getMarks()) ;
	}

}
