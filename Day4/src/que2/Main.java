package que2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(101, "chaitali",980));
		students.add(new Student(121, "akshay",420));
		students.add(new Student(132, "komal",420));
		students.add(new Student(143, "snehal",440));
		students.add(new Student(156, "pooja",630));
		students.add(new Student(168, "teju",890));
		
Optional<Student> opt = students.stream().max( (s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 :-1);
		
		
		Student maxStudent= opt.get();
		
		System.out.println(maxStudent);

	}

}
