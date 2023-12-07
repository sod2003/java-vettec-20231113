package com.skillstorm.groupwork;

public class InvalidSalaryException extends InvalidPayException {
	
	public InvalidSalaryException() {}
	
	public InvalidSalaryException(String message) {
		super(message);
	}
}
