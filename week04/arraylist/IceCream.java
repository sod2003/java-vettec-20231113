package com.skillstorm.arraylist;

public class IceCream {
	private String flavor;
    private double price;
   
	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return String.format("%-15s$%.2f", flavor, price);
	}

	public boolean equals(Object o) {
		if (o == null || o.getClass() != IceCream.class) {
			return false;
		}

		IceCream other = (IceCream) o;
		if (!this.getFlavor().toLowerCase().equals(other.getFlavor().toLowerCase())) {
			return false;
		}

		return true;
	}
}
