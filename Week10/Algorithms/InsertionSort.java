package Week10.Algorithms;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before Insertion Sort: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After Insertion Sort: " + Arrays.toString(numbers));
    }

    private static void insertionSort(int[] input) {
        // int[] numbers = new int[input.length];
        for(int i = 1; i < input.length; i++) {
            int currentValue = input[i];
            int j = i - 1;

            while((j >= 0) && (input[j] > currentValue)) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = currentValue;
        }
    }
}
