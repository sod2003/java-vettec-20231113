package Week10.Algorithms;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before Selection Sort: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After Selection Sort: " + Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;
        for(int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;

            for(int j = i + 1; j < length; j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
