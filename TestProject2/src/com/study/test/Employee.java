package com.study.test;

public class Employee {
	
	private int empID;
	private double salary;
	private double deductions;
	private int slabRate;
	private double taxableIncome;
	
	Employee(int empID, double salary,double deductions,int slabRate){
		this.empID = empID;
		this.salary=salary;
		this.deductions = deductions;
		this.slabRate = slabRate;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public int getSlabRate() {
		return slabRate;
	}

	public void setSlabRate(int slabRate) {
		this.slabRate = slabRate;
	}

	public void setTaxableIncme(double d) {
		
		this.taxableIncome = d;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", salary=" + salary + ", deductions=" + deductions + ", slabRate="
				+ slabRate + ", taxableIncome=" + taxableIncome + "]";
	}

	
}
