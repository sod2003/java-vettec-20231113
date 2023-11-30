package com.skillstorm.classes;

public class TestCircle {
	public static void main(String[] args) {
		System.out.println("Making Circle1");
		Circle circle1 = new Circle();
		circle1.print();
		System.out.println("Making Circle2");
		Circle circle2 = new Circle(2.3);
		circle2.print();
		System.out.format("Is circle1 comparable to circle2? %b\n\n",
				circle1.compare(circle2));
		System.out.println("Changing circle2's radius to 2.0");
		circle2.setRadius(2.0);
		circle2.print();
		System.out.format("Is circle1 comparable to circle2 after the radius "
				+ "change? %b", circle1.compare(circle2));
	}
}
