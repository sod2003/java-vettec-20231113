package com.skillstorm.classes.groupwork;

public class Dog extends Animal/* Make Dog inherit from Animal */{
	
	/* Add some properties */
	boolean isGoodBoy;
	public Dog() {
		super("Spot", true, false);
		isGoodBoy = true;
	}

	public Dog(String name, boolean isAlive, boolean isExtinct, boolean isGoodBoy) {
		super(name, isAlive, isExtinct);
		this.isGoodBoy = isGoodBoy;
	}

	public boolean isGoodBoy() {
		return isGoodBoy;
	}

	public void setGoodBoy(boolean isGoodBoy) {
		this.isGoodBoy = isGoodBoy;
	}

	/* Override the talk toString and equals methods*/
	public void talk() {
		System.out.println("Arf!");
	}
	
	public String toString() {
		String str = String.format("This is %s. ", getName());
		if (!isGoodBoy() == true) {
			return str + "He's not such a good boy!";
		}
		return str + "He's a good boy!";
		
	}
	
	public boolean equals(Dog otherDog) {
		if (!(this.getName().equals(otherDog.getName()))) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.talk();
		System.out.println(dog.toString());
		Dog dog2 = new Dog("Fido", true, false, true);
;		System.out.println(dog.equals(dog2));
		
	}
}
