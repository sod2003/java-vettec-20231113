package com.skillstorm.classes.groupwork;

public class Dog extends Animal/* Make Dog inherit from Animal */{
	
	/* Add some properties */
	boolean isGoodBoy;
	/* Override the talk toString and equals methods*/
	public Dog() {
		name = "Spot";
		isAlive = true;
		isExtinct = false;
		isGoodBoy = true;
	}

	public Dog(String name, boolean isAlive, boolean isExtinct, boolean isGoodBoy) {
		this.name = name;
		this.isAlive = isAlive;
		this.isExtinct = isExtinct;
		this.isGoodBoy = isGoodBoy;
	}
	
	public void talk() {
		System.out.println("Arf!");
	}
	
	public String toString() {
		String str = String.format("This is %s. ", name);
		if (!isGoodBoy == true) {
			return str + "He's not such a good boy!";
		}
		return str + "He's a good boy!";
		
	}
	
	public boolean equals(Dog otherDog) {
		if (!(this.name == otherDog.name)) {
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
