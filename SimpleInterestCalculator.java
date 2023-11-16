package com.skillstorm.calculators;
import java.util.Scanner;
/*
 * Simple Interest Calculator by Sean O'Dowd
 * 
 * This Interest Calculator takes 3 inputs from the user: principal, 
 * rate (as a percentage), and the amount of time. It outputs the results  of 
 * this formula with 2 decimal places: A = P(1 + rt)
 * 
 *   A = Total Accrued Amount (principal + interest)
 *   P = Principal Amount
 *   I = Interest Amount
 *   r = Rate of Interest per year in decimal; r = R/100
 *   R = Rate of Interest per year as a percent; R = r * 100
 *   t = Time Period involved in months or years
 */

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Simple Interest Calculator");
		System.out.println("What is the principal loan amount? (e.g 1000.00 for "
				+ "$1,000 in principal)");
		double principal = scanner.nextDouble();
		System.out.println("What is the rate on the loan? (e.g. 3.34 for an "
				+ "interest rate of 3.34%)");
		double rate = scanner.nextDouble();
		System.out.println("How many years on the loan? (e.g. 10 for a term of "
				+ "10 years)");
		double time = scanner.nextDouble();
		
		
		double r = rate/100;
		double amount = principal * (1 + r * time);
		System.out.format("The total amount accrued, principal"
				+ " plus interest,\n from simple interest on a principal of "
				+ "$%,.2f at a\n rate of %.2f%% per year for %f years is "
				+ "$%,.2f" + ".", principal, rate, time, amount);
		scanner.close();
	}

}
