package Week04.fillable;

public class GasTank implements Fillable {
	private final double GALLONS;
    private double gas;

    public GasTank(double gallons) {
        this.GALLONS = gallons;
    }
    
	@Override
	public void fill() {
		gas = GALLONS;
	}

	@Override
	public void empty() {
		gas = 0;
	}

	@Override
	public void fill(double quantity) {
		if (quantity + gas < GALLONS) {
			gas = gas + quantity;
		} else {
			gas = GALLONS;
		}
	}

	@Override
	public void empty(double quantity) {
		if (quantity < gas) {
			gas = gas - quantity;
		} else {
			gas = 0;
		}
	}

	public String toString() {
		return String.format("This %.1f Gallon Gas Tank has %.1f gallons currently "
				+ "in it.", GALLONS, gas);
	}

	public boolean equals(Object obj) {
		if (obj == null || !obj.getClass().equals(GasTank.class)) {
			return false;
		}
		GasTank other = (GasTank) obj;
		if (gas != other.gas) {
			return false;
		}
		return true;
	}
}
