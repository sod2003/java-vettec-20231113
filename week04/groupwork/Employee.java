package Week04.groupwork;

public abstract class Employee {
	
	// TODO 1 encapsulate
	@SuppressWarnings("unused")
	private long id = 1;
	@SuppressWarnings("unused")
	private String name = "Name";
	@SuppressWarnings("unused")
	private Employee manager = null;
	
	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;
}
