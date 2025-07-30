package com.sujata.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.model.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Collection<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {

		return employeeDao.findById(employeeId).orElse(null);

	}

	@Override
	public boolean saveEmployee(Employee employee) {
//		employeeDao.save(employee);
//		return true;
		try {
		int rows = employeeDao.insertEmployee(employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpDepartment(), employee.getEmpSalary());
		if (rows > 0)
			return true;
		}
		catch(Exception ex) {
			return false;
		}
		return false;
	}





}
