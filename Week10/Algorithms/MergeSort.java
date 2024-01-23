package Week10.Algorithms;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before Insertion Sort: " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("After Insertion Sort: " + Arrays.toString(numbers));
    }

    private static void mergeSort(int[] input) {
        if(input.length < 2) {
            return;
        }

        int midIndex = input.length / 2;
        int[] left = new int[midIndex];
        int[] right = new int[input.length - midIndex];

        for(int i = 0; i < midIndex; i++) {
            left[i] = input[i];
        }

        for(int i = midIndex; i < input.length; i++) {
            right[i - midIndex] = input[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(input, left, right);
    }

    private static void merge(int[] input, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0; //iterator for left half
        int j = 0; //iterator for right half
        int k = 0; //iterator for merged array

        while((i < leftSize) && (j < rightSize)) {
            if(left[i] <= right[j]) {
                input[k++] = left[i++];
            } else {
                input[k++] = right[j++];
            }
        }

        while(i < leftSize) {
            input[k++] = left[i++];
        }

        while(j < rightSize) {
            input[k++] = right[j++];
        }
    }
}
