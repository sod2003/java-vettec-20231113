package Week10.DesignPatterns.groupwork;

public final class Coffee {
    private final String coffeeType;
    private final String roast;

    public Coffee(String coffeeType, String roast) {
        this.coffeeType = coffeeType;
        this.roast = roast;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public String getRoast() {
        return roast;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coffeeType == null) ? 0 : coffeeType.hashCode());
        result = prime * result + ((roast == null) ? 0 : roast.hashCode());
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
        Coffee other = (Coffee) obj;
        if (coffeeType == null) {
            if (other.coffeeType != null)
                return false;
        } else if (!coffeeType.equals(other.coffeeType))
            return false;
        if (roast == null) {
            if (other.roast != null)
                return false;
        } else if (!roast.equals(other.roast))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return coffeeType + " " + roast;
    }
}
