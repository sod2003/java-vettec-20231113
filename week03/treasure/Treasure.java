package com.skillstorm.classes;

public class Treasure {
	private String name;
    private String description;
    private double value; // worth in dollars

	public Treasure(String name, String description, double value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public Treasure() {
		name = "sword";
		description = "gleaming";
		value = 12.055;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public String toString() {
		return String.format("a %s %s worth $%.2f", getDescription(), getName(),
				getValue());
	}
}
