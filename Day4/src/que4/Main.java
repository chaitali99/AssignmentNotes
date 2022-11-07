package que4;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Set<Student> student=new TreeSet<>();
		student.add(new Student(1,"chaitali",560));
		student.add(new Student(1,"chaitali",560));//duplicate
		student.add(new Student(2,"chaitu",760));
		student.add(new Student(3,"akshay",850));
		student.add(new Student(4,"amruta",980));
		student.add(new Student(5,"payal",840));
		
		System.out.println("All set of student.....................");
		
		student.forEach(s->{
			System.out.println(s);
		});

		
		System.out.println("========================================================");
		
		
		Set<Student> filteredList=student.stream().filter(s->s.getMarks()<500).collect(Collectors.toSet());
		
		System.out.println();
		
		System.out.println("*************student get less than 500 marks*************************");
		
		filteredList.forEach(f->System.out.println(f));
		
		
	}

}