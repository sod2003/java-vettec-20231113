package Week04.fillable;

public class TestFillable {

	public static void main(String[] args) {
		Fillable coffee = new CoffeeMug(12);
		coffee.fill();
		System.out.println(coffee);
		coffee.empty(3.4);
		System.out.println(coffee);
		
		Fillable tank = new GasTank(5);
		System.out.println(tank);
		tank.fill(3.3);
		System.out.println(tank);
		tank.fill(3.3);
		System.out.println(tank);
		Fillable tank2 = new GasTank(5);
		tank2.fill();
		System.out.println(tank.equals(tank2));		
	}

}
