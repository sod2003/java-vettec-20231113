package Week10.DesignPatterns.Factory;

public class Superhero {
    private String name;
    private String powers;
    private boolean onTheCase;

    public Superhero(String name, String powers, boolean onTheCase) {
        this.name = name;
        this.powers = powers;
        this.onTheCase = onTheCase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public boolean isOnTheCase() {
        return onTheCase;
    }

    public void setOnTheCase(boolean onTheCase) {
        this.onTheCase = onTheCase;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((powers == null) ? 0 : powers.hashCode());
        result = prime * result + (onTheCase ? 1231 : 1237);
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
        Superhero other = (Superhero) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (powers == null) {
            if (other.powers != null)
                return false;
        } else if (!powers.equals(other.powers))
            return false;
        if (onTheCase != other.onTheCase)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + ", whose powers are " + powers + ", is available to take the case.";
    }
}
