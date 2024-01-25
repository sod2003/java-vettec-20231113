package Week10.DesignPatterns.Composite;

public class Leaf extends Component {
    private int num;

    public Leaf(int num) {
        this.num = num;
    }

    @Override
    public int doWork() {
        return num * num;
    }

    @Override
    public String toString() {
        return "Leaf " + num;
    }
}
