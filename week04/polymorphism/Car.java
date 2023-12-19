package Week04.polymorphism;

public class Car implements Vehicle/* TODO 1 make car a vehicle */ {
	private String make;
	private String model;
	private int year;

	@Override
	public void go() {
		System.out.println("Car is going.");

	}
}
