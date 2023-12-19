package Week06.Generics;
import java.util.ArrayList;
import java.util.List;

public class IntegerContainer {
    ArrayList<Integer> values;

    public IntegerContainer(List<Integer> array) {
        values.addAll(array);
    }

    public void printContainer() {
        for (Integer number : values) {
            System.out.print(number + " ");
        }
    }
}
