package com.skillstorm.shapes;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		setSides(3);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return (base * height) / 2.0;
	}
	
	public String toString() {
		return String.format("This is a Triangle of %.1f\" x %.1f\", with an "
				+ "area of %.1f in\u00B2. %s", base, height, area(),
				super.toString()); 
	}
	
}
