package com.skillstorm.classes.groupwork;

public class Cat extends Animal/* Make Cat inherit from Animal */{
	/* Add some properties*/
	boolean isFriendly;
	/* Override the talk method*/
	public Cat() {
		name = "Tom";
		isAlive = true;
		isFriendly = false;
		isExtinct = false;
	}
	
	public Cat(String name, boolean isAlive, boolean isExtinct, boolean isFriendly) {
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
		this.isFriendly = isFriendly;
	}
	
	public void talk() {
		System.out.println("Meow");
	}
	
}
