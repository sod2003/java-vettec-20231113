package com.skillstorm.classes;

public class TestCircle {
	public static void main(String[] args) {
		System.out.println("Making Circle1");
		Circle circle1 = new Circle();
		System.out.println("Making Circle2");
		Circle circle2 = new Circle(2.3);
		System.out.format("Is circle1 comparable to circle2? %b\n\n", circle1.compare(circle2));
		System.out.println("Making Circle3");
		Circle circle3 = new Circle(2.0);
		System.out.format("Is circle1 comparable to circle3? %b", circle1.compare(circle3));
	}
}
