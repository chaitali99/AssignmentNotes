package que1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student s) {
		System.out.println("Student name: "+s.getName());
		System.out.println("Student Roll No: "+s.getRoll());
		System.out.println("Student Marks: "+s.getMarks());
		System.out.println("=============================================");

	}

}
