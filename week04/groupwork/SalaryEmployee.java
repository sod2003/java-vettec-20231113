package com.skillstorm.groupwork;

public class SalaryEmployee extends Employee {
	// TODO 4 encapsulate (throw custom exception in setter guard clause)
	private double salary; // annual salary
	
	public SalaryEmployee(double salary) {
		this.salary = salary;
	}
	// TODO 5 override calculate pay
	@Override
	public double calculatePay() {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if (salary < 0) {
			throw new InvalidSalaryException();
		}
		this.salary = salary;
	}
	
	
}
