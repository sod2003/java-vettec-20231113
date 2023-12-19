package Week04.groupwork;

public class HourlyEmployee extends Employee {
	// TODO 2 encapsulate and throw exception in the setter
	private double hoursWorked;
	private double wage; // per hour
	private static double MINIMUM_WAGE = 7.25;
	
	public HourlyEmployee(double hoursWorked, double wage) {
		this.hoursWorked = hoursWorked;
		try {
			setWage(wage);
		} catch (InvalidWageException e) {
			System.out.println(e.getMessage());
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
		if (wage < MINIMUM_WAGE) {
			this.wage = MINIMUM_WAGE;
			throw new InvalidWageException("Tried to set wage too low. Setting "
					+ "to Minimum Wage.");
		}
		this.wage = wage;
	}
	
	
}
