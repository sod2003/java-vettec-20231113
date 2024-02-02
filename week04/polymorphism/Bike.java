package Week04.polymorphism;

public class Bike implements Vehicle/* TODO 3 make Bike a vehicle */ {
	@SuppressWarnings("unused")
	private String color;
	@SuppressWarnings("unused")
	private int numGears;

	@Override
	public void go() {
		System.out.println("Bike is going");
	}
}
