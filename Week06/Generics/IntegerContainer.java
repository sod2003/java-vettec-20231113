package Week06.Generics;

public class IntegerContainer {
    int[] values;

    public IntegerContainer(int[] array) {
        values = array;
    }

    public void printContainer() {
        for (int number : values) {
            System.out.print(number + " ");
        }
    }
}
