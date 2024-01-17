package Week09;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int begin, int end) {
        int pivot = partition(arr, begin, end);

        if (begin < pivot - 1) {
            quickSort(arr, begin, pivot - 1);
        }

        if (pivot < end) {
            quickSort(arr, pivot, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int i = begin, j = end;
        int tmp;
        int pivot = arr[(begin + end) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot)
                j--;
                if (i <= j) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 4, 7, 9, 8, 2, 10, 1, 6};
        System.out.println("Array before Quick Sort: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length -1);
        System.out.println("Array after Quick Sort: " + Arrays.toString(array));
    }
}
