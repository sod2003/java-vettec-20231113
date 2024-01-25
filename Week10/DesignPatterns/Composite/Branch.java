package Week10.DesignPatterns.Composite;
import java.util.ArrayList;
import java.util.List;

public class Branch extends Component {
    private List<Component> subcomponents = new ArrayList<>();
    private int num;

    public Branch(int num) {
        this.num = num;
    }

    @Override
    public int doWork() {
        return num * num + subcomponents.stream().mapToInt(Component::doWork).sum();
    }

    public void add(Component component) {
        subcomponents.add(component);
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        for ( Component c : subcomponents) {
            value.append(c).append("\n ");
        }
        return "Branch " + num + ": " + value;
    }
}
