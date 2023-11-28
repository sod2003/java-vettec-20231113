package com.skillstorm.loops;
import java.util.Arrays;

public class CopyGroupChallenge {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int[] numbers2 = {5, 6, 7};
		System.out.println(Arrays.toString(copyRange(numbers, 1, 2)));
		System.out.println(Arrays.toString(copyRange(numbers, 2, 1)));
		System.out.println(Arrays.toString(append(numbers, numbers2)));
		System.out.println(allEven(numbers));
		int[] numbers3 = {2, 4, 0};
		System.out.println(allEven(numbers3));
		String str = "abc";
		System.out.println(rotate(str, 1));
	}
	
	/**
	 * Copy All returns a new array with all the elements from the original array
	 * copied over. Not using the Arrays utility class's copy method!
	 * @author Erica
	 */
	public static int[] copy(int[] numbers) {
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		return copy;
	}
	
	/**
	 * Copy range from start index (inclusive) to end index (exclusive)
	 * @return A new array with all the elements between the start and end index
	 *         If end > length what should we do? returns everything up to the end of the array and nothing beyond
	 *         If start >= end what should we do? returns an empty array
	 * @author Team
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		int[] copy = {};
		if (!(end < start)) {
			copy = new int[end - start];
			int copyIndex = 0;
			for (int index = start; index < numbers.length && index < end; index++) {
				copy[copyIndex++] = numbers[index];
			}
			
		}
		return copy;
	}
	
	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @author Team
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		int[] copy = new int[arr1.length + arr2.length];
		int pivot = arr1.length;
		for (int i = 0; i < pivot; i++) {
			copy[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++ ) {
			copy[pivot + i] = arr2[i];
		}
		return copy;
	}
	
	/**
	 * Write a method that takes in a number array
	 * and returns true if the array contains negative values
	 * @author Erica
	 */
	public static boolean containsNegatives(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				return true;
		}
		return false;
	}
	
	/**
	 * Write a method that returns true if all the number are even
	 * @author Team
	 */
	public static boolean allEven(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (!(nums[i] % 2 == 0)) {
				return false;	
			}
		}
		return true;
	}
	
	/**
	 * Write a method that takes in a String 
	 * and encodes it by rotating all the letters by n characters.
	 * @author Team
	 */
	public static String rotate(String str, int rotation) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += (char) (str.charAt(i) + rotation);
		}
		
		return result;
	}
	
	// Helper method
}
