package com.skillstorm.arithmetic;
/* Arithmetic Assignment by Sean O'Dowd
 * 
 * This assignment will show Remainder Operator, Order of Operations, 
 * Integer Arithmetic, and Type casting calculations. I will comment my
 * personal calculations in a separate file called arithmetic.txt, then run 
 * Java code to complete the calculations within the main function below.
 * 
 * Comparison observations: The Remainder Operator number 11 is division by 0,
 * and it errors out when run. What surprised me the most are the Type Casting
 * problems, namely numbers 3 and 4. It's confusing when trying to guess what
 * the results would be from narrow casting large numbers. I also guessed wrong
 * on the MAX_VALUE problems in the Integer Arithmetic section. Those results
 * weren't implicitly wide casted, and they wouldn't expand past the range
 * limitations of the primitive data types. 
 * */
public class Arithmetic {
	public static void main(String[] args){
//		Using Remainder Operator
		System.out.println("1. 5 + 7 % 6 = " + (5 + 7 % 6));
		System.out.println("2. 12 % 6 = " + (12 % 6));
		System.out.println("3. 6 % 12 = " + (6 % 12));
		System.out.println("4. 3 % 5 = " + (3 % 5));
		System.out.println("5. 5 % 3 = " + (5 % 3));
		System.out.println("6. 5 % 5 = " + (5 % 5));
		System.out.println("7. 1 % -2 = " + (1 % -2));
		System.out.println("8. -1 % 2 = " + (-1 % 2));
		System.out.println("9. -1 % -2 = " + (-1 % -2));
		System.out.println("10. 0 % 2 = " + (0 % 2));
//		System.out.println("11. 2 % 0 = " + (2 % 0));
		System.out.println("12. 6 * 2 % 6 = " + (6 * 2 % 6));
		System.out.println("13. 12 % 4 = " + (12 % 4));
		System.out.println("14. 7 % 3 % 2 = " + (7 % 3 % 2));

//		Order of Operations:
		System.out.println("1. 10 - 12 * 2 = " + (10 - 12 * 2));
		System.out.println("2. 5 * (3 - 2) = " + (5 * (3 - 2)));
		System.out.println("3. 5 + 2 * 3 = " + (5 + 2 * 3));
		System.out.println("4. 7 + 2 * 3 / 5 - 1 = " + (7 + 2 * 3 / 5 - 1));
		System.out.println("5. 18 / 3 % 7 * (4 + 1) = " + (18 / 3 % 7 * (4 + 1)));

//		Integer Arithmetic:
		System.out.println("1. 15 / 3 / 5 = " + (15 / 3 / 5));
		System.out.println("2. 1 / 2 = " + (1 / 2));
		System.out.println("3. 3 / 4 = " + (3 / 4));
		System.out.println("4. 4 / 3 = " + (4 / 3));
		System.out.println("5. Integer.MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));
		System.out.println("6. Integer.MIN_VALUE - 1 = " + (Integer.MIN_VALUE - 1));
		System.out.println("7. Integer.MAX_VALUE + Integer.MIN_VALUE = " 
		+ (Integer.MAX_VALUE + Integer.MIN_VALUE));
		System.out.println("8. Short.MAX_VALUE + 1 = " + (Short.MAX_VALUE + 1));
		System.out.println("9. Short.MIN_VALUE - 1 = " + (Short.MIN_VALUE - 1));
		System.out.println("10. Short.MAX_VALUE + Short.MIN_VALUE = " 
		+ (Short.MAX_VALUE + Short.MIN_VALUE));

//		Type Casting:
		System.out.println("1. (int) 7.9 - 3 = " + ((int) 7.9 - 3));
		System.out.println("2. (int) 84.3 / (int) 2.8 = " + ((int) 84.3 / (int) 2.8));
		System.out.println("3. (byte) 1000 - 10 = " + ((byte) 1000 - 10));
		System.out.println("4. (short) 100000 = " + ((short) 100000));
		System.out.println("5. (long) 10 + -10 = " + ((long) 10 + -10));
	}
}
