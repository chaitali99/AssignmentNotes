package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetSalaryUseCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		int salary=dao.getSalaryById(id);
		
		if(salary>0) {
			System.out.println("Salary is: "+salary);
		}else {
			System.out.println("Employee does not exist with id: "+id);
		}
	}

}
