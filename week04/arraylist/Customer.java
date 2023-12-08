package com.skillstorm.arraylist;

public class Customer {
	private IceCream iceCream;
    private String name;

	public Customer(IceCream iceCream, String name) {
		this.iceCream = iceCream;
		this.name = name;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("%s ordered %s.", name, iceCream.getFlavor());
	}
}
