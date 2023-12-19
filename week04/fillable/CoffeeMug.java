package Week04.fillable;

public class CoffeeMug implements Fillable {

	private final double OUNCES;
    private double coffee;

    public CoffeeMug(double ounces) {
        this.OUNCES = ounces;
    }
    
	@Override
	public void fill() {
		coffee = OUNCES;
	}

	@Override
	public void empty() {
		coffee = 0;
	}

	@Override
	public void fill(double quantity) {
		if (quantity + coffee < OUNCES) {
			coffee = coffee + quantity;
		} else {
			coffee = OUNCES;
		}
	}

	@Override
	public void empty(double quantity) {
		if (quantity < coffee) {
			coffee = coffee - quantity;
		} else {
			coffee = 0;
		}
	}

	public String toString() {
		return String.format("This %.1f Oz Coffee Mug has %.1f ounces of coffee "
				+ "currently in it.", OUNCES, coffee);
	}

	public boolean equals(Object obj) {
		if (obj == null || !obj.getClass().equals(CoffeeMug.class)) {
			return false;
		}
		CoffeeMug other = (CoffeeMug) obj;
		if (coffee != other.coffee) {
			return false;
		}
		return true;
	}
}
