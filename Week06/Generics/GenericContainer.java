package Week06.Generics;

public class GenericContainer<T> {
    T[] values;

    public GenericContainer(T[] array) {
        values = array;
    }

    public void printContainer() {
        for (T number : values) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3};
        GenericContainer<Integer> integerContainer = new GenericContainer<>(integers);
        integerContainer.printContainer();

        Double[] doubles = new Double[]{1.1, 2.5, 3.0};
        GenericContainer<Double> doubleContainer = new GenericContainer<>(doubles);
        doubleContainer.printContainer();
    }
}
