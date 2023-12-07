package com.skillstorm.groupwork;

public class TestEmployees {
	
	public static void main(String[] args) {
		Employee employee = new SalaryEmployee(1200.0);
		Employee employee2 = new HourlyEmployee(40, 7.50);
		HourlyEmployee employee3 = new HourlyEmployee(40, 7);

		try {
			System.out.println(employee.calculatePay());
			System.out.println(employee2.calculatePay());
			System.out.println(employee3.calculatePay());
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		} catch (InvalidWageException e) {
			System.out.println(e.getMessage());			
		} catch (InvalidPayException e) {
			System.out.println(e.getMessage());	
		}
	}

}
