package com.ricky.service;

import java.util.List;

import com.ricky.model.Employee;

/**
 * @author ricky
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}