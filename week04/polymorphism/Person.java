package Week04.polymorphism;

public class Person {
	
	private String name;
	private Vehicle vehicle;
	
	public Person(String string, Vehicle vehicle) {
		name = string;
		this.vehicle = vehicle;
	}

	void commute() {
		vehicle.go();
	}

}
