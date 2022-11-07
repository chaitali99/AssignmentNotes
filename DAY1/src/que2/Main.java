package que2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			EmployeeIdComp idcomp=new EmployeeIdComp();
			TreeSet<Employee>ts=new TreeSet<>(idcomp);
			ts.add(new Employee(111,"A1","Nagpur",12300));
			ts.add(new Employee(123,"A3","Amt",21900));
			ts.add(new Employee(112,"A5","Mumbai",12340));
			ts.add(new Employee(110,"A0","pune",13445));
			ts.add(new Employee(198,"A2","Banglore",12350));
			ts.add(new Employee(132,"A9","chennai",12309));

			for(Employee e:ts) {
				System.out.println(e);
			}
			break;
		case 2:
			EmployeeAddressComp addcomp=new EmployeeAddressComp();
			TreeSet<Employee>ts1=new TreeSet<>(addcomp);
			ts1.add(new Employee(111,"A1","Nagpur",12300));
			ts1.add(new Employee(123,"A3","Amt",21900));
			ts1.add(new Employee(112,"A5","Mumbai",12340));
			ts1.add(new Employee(110,"A0","pune",13445));
			ts1.add(new Employee(198,"A2","Banglore",12350));
			ts1.add(new Employee(132,"A9","chennai",12309));

			for(Employee e:ts1) {
				System.out.println(e);
			}

			break;
		case 3:
			EmployeeSalaryComp salcomp=new EmployeeSalaryComp();
			TreeSet<Employee>ts11=new TreeSet<>(salcomp);
			ts11.add(new Employee(111,"A1","Nagpur",12300));
			ts11.add(new Employee(123,"A3","Amt",21900));
			ts11.add(new Employee(112,"A5","Mumbai",12340));
			ts11.add(new Employee(110,"A0","pune",13445));
			ts11.add(new Employee(198,"A2","Banglore",12350));
			ts11.add(new Employee(132,"A9","chennai",12309));

			for(Employee e:ts11) {
				System.out.println(e);
			}

			break;
		}
	}

}
