package Week06.Generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericContainer {
    ArrayList<Number> values = new ArrayList<>();

    public GenericContainer(List<? extends Number> array) {
        values.addAll(array);
    }

    public void printContainer() {
        for (Number number : values) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        GenericContainer integerContainer = new GenericContainer(integers);
        integerContainer.printContainer();
        System.out.println("");
        List<Double> doubles = Arrays.asList(1.1, 2.5, 3.0);
        GenericContainer doubleContainer = new GenericContainer(doubles);
        doubleContainer.printContainer();
    }
}
