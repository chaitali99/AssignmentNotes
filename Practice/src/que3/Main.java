package que3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	
	
	
	public static void main(String[] args) {
		Map<String, Student> m=new HashMap<>();
		
		m.put("India", new Student(111,"chitali","chiatli@gmail.com",400));
		m.put("India", new Student(123,"akshay","akshay@gmail.com",500));
		m.put("India", new Student(124,"shreya","shreya@gmail.com",800));
		m.put("India", new Student(112,"bhumika","bhumika@gmail.com",300));
		m.put("India", new Student(113,"aprna","aprna@gmail.com",350));
		Main mObj=new Main();
		Map<String, Student> result=mObj.sortMapUsingStudentName(m);
		
		for(Map.Entry<String,Student> l:result.entrySet()) {
			System.out.println("Student from:"+l.getKey());
			System.out.println("====================================");
			Student s1=l.getValue();
			System.out.println("Student roll: "+s1.getRoll());
			System.out.println("Student name: "+s1.getName());
			System.out.println("Student email: "+s1.getEmail());
			System.out.println("Student marks: "+s1.getMarks());
			System.out.println("=======================================");
			System.out.println();

		}

	}
	
public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap){
		
		Set<Entry<String,Student>> arr=originalMap.entrySet();
		List<Entry<String,Student>> list=new ArrayList<>(arr);
		
		Collections.sort(list,(s1,s2)->s1.getValue().getName().compareTo(s2.getValue().getName()));
		
		Map<String,Student> map=new LinkedHashMap<>();
		for(Entry<String, Student> a:list) {
			map.put(a.getKey(), a.getValue());
		}
		//System.out.println(list);
		return map;
	}


}
