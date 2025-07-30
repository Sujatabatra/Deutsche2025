package com.sujata.model.service;

import java.util.Collection;
import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployee();
	Employee searchEmployeeById(int employeeId);
	boolean saveEmployee(Employee employee);

}
