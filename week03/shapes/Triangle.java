package com.skillstorm.shapes;

public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) {
		setSides(3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Using Heron's Formula to use all 3 sides to calculate the area
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1)* (s - side2) * (s - side3));
	}
	
	public double perimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return String.format("This is a Triangle with sides of length %.1f\", "
				+ "%.1f\", and %.1f\", with an area of %.1f in\u00B2 and a "
				+ "perimeter of %.1f\". %s", side1, side2, side3, area(), 
				perimeter(), super.toString()); 
	}
	
}
