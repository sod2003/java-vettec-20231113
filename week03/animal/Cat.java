package com.skillstorm.classes.groupwork;

public class Cat extends Animal/* Make Cat inherit from Animal */{
	/* Add some properties*/
	boolean isFriendly;
	/* Override the talk method*/
	public Cat() {
		super("Tom", true, false);
		isFriendly = false;
	}
	
	public Cat(String name, boolean isAlive, boolean isExtinct, boolean isFriendly) {
		super(name, isAlive, isExtinct);
		this.isFriendly = isFriendly;
	}
	
	public boolean isFriendly() {
		return isFriendly;
	}

	public void setFriendly(boolean isFriendly) {
		this.isFriendly = isFriendly;
	}

	public void talk() {
		System.out.println("Meow");
	}
	
}
