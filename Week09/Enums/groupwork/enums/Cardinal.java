package Week09.Enums.groupwork.enums;

import Week09.Enums.groupwork.interfaces.Direction;

/**
 * An enum (a set of constants) that represents the cardinal directions on a compass. 
 * 
 * To learn more, read https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 *
 */
public enum Cardinal implements Direction {
	
	// TODO 1a Create an enum 
	//  that represents the cardinal directions on a compass
	NORTH, SOUTH, EAST, WEST;


	// TODO 1b Return the opposite direction
	// Hint: Use the this keyword to see what the current direction is
	@Override
	public Cardinal reverse() {
		switch(this) {
			case NORTH:
				return SOUTH;
			case SOUTH:
				return NORTH;
			case WEST:
				return EAST;
			case EAST:
				return WEST;
			default:
				return null;
		}
	}
	

}
