package Week03.shapes;

public class Shape {
	private int sides;
	
//	protected Shape(int sides) {
//		this.sides = sides;
//	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public String toString() {
		if (sides == 0) {
			return "You can't have a Shape with no sides.";
		}
		return String.format("This Shape has %d sides.", sides);
	}
}
