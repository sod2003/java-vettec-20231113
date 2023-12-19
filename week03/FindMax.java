package Week03;

import java.util.Arrays;

/**
 * @author Sean O'Dowd
 * A program for finding the maximum integer value within an Integer array.
 */
public class FindMax {
	
	public static void main(String[] args) {
		int[] testArray = null;
		System.out.println("Max of " + Arrays.toString(testArray) + " array: " + findMax(testArray));
		testArray = new int[0];
		System.out.println("Max of " + Arrays.toString(testArray) + " array: " + findMax(testArray));
		testArray = new int[] {5};
		System.out.println("Max of " + Arrays.toString(testArray) + " array: " + findMax(testArray));
		testArray = new int[] {2, 6, 8, 0};
		System.out.println("Max of " + Arrays.toString(testArray) + " array: " + findMax(testArray));
		
		// Bonus
		testArray = new int[] {-1, -4, -3, 0};
		System.out.println("\nMin of " + Arrays.toString(testArray) + " array: " + findMin(testArray));
	}
	
	/**
	 * findMax Method
	 * @param array The int array to be searched
	 * @return the highest value in the array, or 0 if the array is null or empty.
	 */
	public static int findMax(int[] array) {
		int max = 0;
		if (!(array == null || array.length == 0)) {
			max = array[0];
			for (int i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		return max;
		
	}
	
	/**
	 * findMin Method
	 * @param array The int array to be searched
	 * @return the lowest value in the array, or 0 if the array is null or empty.
	 */
	public static int findMin(int[] array) {
		int min = 0;
		if (!(array == null || array.length == 0)) {
			min = array[0];
			for (int i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		return min;
	}

}
