package Week04.groupwork;

public class TestEmployees {
	
	public static void main(String[] args) {
		Employee employee = new SalaryEmployee(20000.0);
		Employee employee2 = new HourlyEmployee(40, 7.50);
		Employee employee3 = new HourlyEmployee(40, 7);

		try {
			System.out.println(String.format("$%.2f", employee.calculatePay()));
			System.out.println(employee2.calculatePay());
			System.out.println(employee3.calculatePay());		
		} catch (InvalidPayException e) {
			System.out.println(e.getMessage());	
		}
	}

}
