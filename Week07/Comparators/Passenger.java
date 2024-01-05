package Week07.Comparators;

public class Passenger {
    private String name;
    public int group;
    
    public Passenger(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public String toString() {
        return name + ", " + group;
    }
}
