package com.skillstorm.groupwork;

public class HourlyEmployee extends Employee {
	// TODO 2 encapsulate and throw exception in the setter
	private double hoursWorked;
	private double wage; // per hour
	
	public HourlyEmployee(double hoursWorked, double wage) {
		this.hoursWorked = hoursWorked;
		try {
			setWage(wage);
		} catch (InvalidWageException e) {
			e.getMessage();
			System.out.println("");
		}
	}
	
	// TODO 3 override calculatePay
	@Override
	public double calculatePay() {
		return hoursWorked * wage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	// Throw custom exception that checks valid wage
	// Federal minimum wage is $7.25
	public void setWage(double wage) throws InvalidWageException {
		if (wage < 7.25) {
			System.out.print("Wage too low.");
			throw new InvalidWageException();
		}
		this.wage = wage;
	}
	
	
}
