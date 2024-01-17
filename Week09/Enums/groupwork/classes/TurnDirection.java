package Week09.Enums.groupwork.classes;

import Week09.Enums.groupwork.enums.Hand;
import Week09.Enums.groupwork.interfaces.Direction;

/**
 * This class represents one step in a set of directions
 * to travel from one location to another along the imaginary
 * grid city of Squareville. (All distances are measurable in blocks,
 * and all roads are on a grid.)
 *
 */
public class TurnDirection implements Direction {

	private Hand turn; // right-hand turn or left-hand turn

	private Road from;

	private Road onto;

	public TurnDirection() {
		super();
	}

	public TurnDirection(Hand turn, Road from, Road onto) {
		super();
		this.turn = turn;
		this.from = from;
		this.onto = onto;
	}

	@Override
	public TurnDirection reverse() {
		////////////////////////////////////////////////////////////////////
		// TODO 4 Reverse this turn direction
		// Hint: Use this.turn, this.from, this.onto to create the reverse
		
		
		TurnDirection newDirection = new TurnDirection(turn.reverse(), this.onto, this.from);
		return newDirection;
		////////////////////////////////////////////////////////////////////
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((turn == null) ? 0 : turn.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((onto == null) ? 0 : onto.hashCode());
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
		TurnDirection other = (TurnDirection) obj;
		if (turn != other.turn)
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (onto == null) {
			if (other.onto != null)
				return false;
		} else if (!onto.equals(other.onto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TurnDirection [turn=" + turn + ", from=" + from + ", onto=" + onto + "]";
	}
}
