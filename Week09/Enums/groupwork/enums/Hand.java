package Week09.Enums.groupwork.enums;

/**
 * This class is used to represent something left-handed or right-handed.
 *
 * To learn more about enums, read https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */
public enum Hand {
	
	// TODO 2a Create an enum 
	//  that represents the constants right and left
	LEFT , RIGHT;
	
	// TODO 2b Return the opposite
	// Hint: Use the this keyword to see what the current value is
	public Hand reverse() {
		switch(this) {
			case LEFT:
				return RIGHT;
			case RIGHT:
				return LEFT;
			default:
				return null;
		}
	}

}
