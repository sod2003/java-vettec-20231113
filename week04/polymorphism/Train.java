package Week04.polymorphism;

public class Train implements Vehicle/* TODO 2 make Train a vehicle */ {
	private String color;
	private int numCars;

	@Override
	public void go() {
		System.out.println("Train is going");

	}
}
