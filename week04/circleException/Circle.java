package com.skillstorm.classes;

public class Circle {
	double radius;
	
	public Circle() {
		try {
			setRadius(2.0);
		} catch (InvalidSizeException e) {
			System.out.println(e.getMessage());
		}
	}
	public Circle(double radius) {
		try {
			setRadius(radius);
		} catch (InvalidSizeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double circumference() {
		return Math.PI * radius * 2;
	}
	
	public double diameter() {
		return 2 * radius;
	}
	
	public String toString() {
		return String.format("Area: %f\nDiameter: %f\nCircumference: %f\n\n",
				area(), diameter(), circumference());
	}
	
	public boolean compare(Circle circle) {
		return this.radius == circle.radius;
	}
	
	public void setRadius(double radius) throws InvalidSizeException {
		if (radius <= 0) {
			throw new InvalidSizeException("Exception! " + radius + " is an "
					+ "invalid size.");
		}
		this.radius = radius;
	}
}
