package Week03.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// Creating a Rectangle
		Rectangle rectangle = new Rectangle(3.0, 2.0);
		System.out.println(rectangle);
		
		// Creating a Shape with no sides
		Shape shape = new Shape();
		System.out.println(shape);
		
		// Creating a Triangle
		Triangle triangle = new Triangle(3.0, 3.0, 3.0);
		System.out.println(triangle);

	}

}
