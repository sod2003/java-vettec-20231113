package Week09.Enums.groupwork.classes;

import Week09.Enums.groupwork.enums.Cardinal;
import Week09.Enums.groupwork.interfaces.Direction;

/**
 * This class represents one step in a set of directions
 * to travel from one location to another along the imaginary
 * grid city of Squareville. (All distances are measurable in blocks,
 * and all roads are on a grid.)
 *
 */
public class ContinueDirection implements Direction {

	private int numBlocks;

	private Cardinal heading;

	private Road road;

	public ContinueDirection() {
		super();
	}

	public ContinueDirection(int numBlocks, Cardinal heading, Road road) {
		super();
		this.numBlocks = numBlocks;
		this.heading = heading;
		this.road = road;
	}

	public ContinueDirection reverse() {
		////////////////////////////////////////////////////////////////////
		// TODO 3 Reverse this continue direction
		// Hint: Use this.turn, this.from, this.onto to create the reverse
		
		ContinueDirection newDirection = new ContinueDirection(this.numBlocks, heading.reverse(), this.road);
		return newDirection;
		////////////////////////////////////////////////////////////////////
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numBlocks;
		result = prime * result + ((heading == null) ? 0 : heading.hashCode());
		result = prime * result + ((road == null) ? 0 : road.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContinueDirection other = (ContinueDirection) obj;
		if (numBlocks != other.numBlocks)
			return false;
		if (heading != other.heading)
			return false;
		if (road == null) {
			if (other.road != null)
				return false;
		} else if (!road.equals(other.road))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContinueDirection [numBlocks=" + numBlocks + ", heading=" + heading + ", road=" + road + "]";
	}
}
