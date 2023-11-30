package com.skillstorm.classes;

public class TreasureChest {
	private double weightInLbs;
	private double height;
	private double length;
	private double width;
	private boolean isLocked;
	private Treasure[] contents;

	public TreasureChest() {
		weightInLbs = 25.0;
		height = 24;
		length = 16;
		width = 18;
		isLocked = false;
		contents = new Treasure[] {};
	}
	
	public TreasureChest(double weightInLbs, double height, double length,
			double width, boolean isLocked, Treasure[] contents) {
		this.weightInLbs = weightInLbs;
		this.height = height;
		this.length = length;
		this.width = width;
		this.isLocked = isLocked;
		this.contents = contents;
	}

	public double getWeightInLbs() {
		return weightInLbs;
	}
	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public Treasure[] getContents() {
		if (isLocked == true) {
			return null;
		}
		return contents;
	}
	public void setContents(Treasure[] contents) {
		this.contents = contents;
	}
	
	public String toString() {
		String lockString = "";
		if (isLocked) {
			lockString = "locked";
		} else {
			lockString = "unlocked";
		}
		String str = String.format("The %.1f\" x %.1f\" x %.1f\" treasure chest "
				+ "weighs %.1flbs and is %s.", getLength(), getWidth(),
				getHeight(), getWeightInLbs(), lockString);
		if (isLocked == false) {
			str = str + " The contents are ";
			for (int i = 0; i < contents.length; i++) {
				if (i < contents.length - 1) {
					str = str + contents[i].toString() + ", ";
				} else {
					str = str + "and " + contents[i].toString() + ".";
				}
			}
		}
		return str;
	}
}
