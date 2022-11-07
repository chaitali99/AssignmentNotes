package que3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student(111,"a1","amt",234));
		students.add(new Student(121,"a2","amt",500));
		students.add(new Student(123,"a9","amt",800));
		students.add(new Student(122,"a2","amt",900));
		students.add(new Student(111,"a1","amt",234));

		Set<Student> unique=new LinkedHashSet<>(students);
		students=new ArrayList<Student>(unique);
		for(Student s:unique) {
			System.out.println(s);
		}
		
		System.out.println("====================================");
		//StudentMarkComp mcomp=new StudentMarkComp();
		Collections.sort(students,new StudentMarkComp());
		for(Student st:students) {
			System.out.println(st);
		}
	}

}
