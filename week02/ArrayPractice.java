package Week02;

import java.util.Arrays;

/*
 * ArrayPractice by Sean O'Dowd
 * 
 * This is a program for demonstrating creating arrays, accessing, and 
 * manipulating their elements.
 */

public class ArrayPractice {

	public static void main(String[] args) {
		// Part 1
		String[] favoriteFoods = new String[] {"Pizza", "Tacos", "Sushi"};
		System.out.println(favoriteFoods[0]);
		System.out.println(favoriteFoods[1]);
		System.out.println(favoriteFoods[2]);
		
		favoriteFoods[1] = "Chimichangas";
		favoriteFoods[2] = "Pho";
		System.out.println("\n" + favoriteFoods[0]);
		System.out.println(favoriteFoods[1]);
		System.out.println(favoriteFoods[2]);
		
		favoriteFoods = Arrays.copyOf(favoriteFoods, 4);
		favoriteFoods[3] = "Perogies";
		System.out.println("\n" + favoriteFoods[0]);
		System.out.println(favoriteFoods[1]);
		System.out.println(favoriteFoods[2]);
		System.out.println(favoriteFoods[3]);
		
		// Part 2
		int[] test1 = {1, 2, 3};
		int[] test2 = {1};
		System.out.println("\nLast element of test1: " + getLastElement(test1));
		System.out.println("Last element of test2: " + getLastElement(test2));
		
		// Bonus
		int[] test3 = {};
		int[] test4 = null;
		System.out.println("\nLast element of test3: " + getLastElement(test3));
		System.out.println("Last element of test4: " + getLastElement(test4));

	}
	
	public static int getLastElement(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		return array[array.length - 1];
	}

}
