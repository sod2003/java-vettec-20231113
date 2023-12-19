package Week04.groupwork;

public abstract class Employee {
	
	// TODO 1 encapsulate
	private long id = 1;
	private String name = "Name";
	private Employee manager = null;
	
	
	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;
	

}
