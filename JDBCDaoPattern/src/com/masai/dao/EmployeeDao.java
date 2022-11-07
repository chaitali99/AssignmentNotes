package com.masai.dao;

import com.masai.model.Employee;

public interface EmployeeDao {
	
	public String insertEmployeeDetails(Employee employee);
	
	public int getSalaryById(int id);

}
