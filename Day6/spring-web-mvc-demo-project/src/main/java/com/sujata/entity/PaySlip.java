package com.sujata.entity;


public class PaySlip {

	private Employee employee;
	private double houseRentAllowance;
	private double fuelAllowance;
	private double deductionOne;
	private double deductionTwo;
	private double netPayableSalary;
	

	public PaySlip(){

	}

	public PaySlip(Employee employee, double houseRentAllowance, double fuelAllowance, double deductionOne, double deductionTwo, double netPayableSalary) {
		this.employee = employee;
		this.houseRentAllowance = houseRentAllowance;
		this.fuelAllowance = fuelAllowance;
		this.deductionOne = deductionOne;
		this.deductionTwo = deductionTwo;
		this.netPayableSalary = netPayableSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(double houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public double getFuelAllowance() {
		return fuelAllowance;
	}

	public void setFuelAllowance(double fuelAllowance) {
		this.fuelAllowance = fuelAllowance;
	}

	public double getDeductionOne() {
		return deductionOne;
	}

	public void setDeductionOne(double deductionOne) {
		this.deductionOne = deductionOne;
	}

	public double getDeductionTwo() {
		return deductionTwo;
	}

	public void setDeductionTwo(double deductionTwo) {
		this.deductionTwo = deductionTwo;
	}

	public double getNetPayableSalary() {
		return netPayableSalary;
	}

	public void setNetPayableSalary(double netPayableSalary) {
		this.netPayableSalary = netPayableSalary;
	}
}
