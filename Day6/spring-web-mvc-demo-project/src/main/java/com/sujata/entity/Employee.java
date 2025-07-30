package com.sujata.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	private int empId;
	private String empName;
	@Column(name = "deptt")
	private String empDepartment;
	@Column(name = "designation")
	private String empDesignation;
//  if any column in table contains null and we want to read it as well, take type of that property as wrapper instead of primituve
	@Column(name = "salary")
	private Double empSalary;

	public Employee(){

	}

	public Employee(int empId, String empName, String empDepartment, String empDesignation, Double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
}
