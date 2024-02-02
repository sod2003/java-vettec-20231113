package Week04.polymorphism;

public class Car implements Vehicle/* TODO 1 make car a vehicle */ {
	@SuppressWarnings("unused")
	private String make;
	@SuppressWarnings("unused")
	private String model;
	@SuppressWarnings("unused")
	private int year;

	@Override
	public void go() {
		System.out.println("Car is going.");

	}
}
