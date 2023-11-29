package com.skillstorm.classes;

public class Circle {
	double radius;
	
	public Circle() {
		this.radius = 2.0;
		print();
	}
	public Circle(double radius) {
		this.radius = radius;
		print();
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
	
	public void print() {
		System.out.format("Area: %f\nDiameter: %f\nCircumference: %f\n\n",
				area(), diameter(), circumference());
	}
	
	public boolean compare(Circle circle) {
		return this.radius == circle.radius;
	}
}
