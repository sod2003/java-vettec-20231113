package Week01;
import java.util.Scanner;

/* Dice Roll program by Sean O'Dowd
 * 
 * This program takes input in from the user, a number between 1 and 6, "rolls"
 * a die using Math.random(), compares the numbers and returns a result to
 * the user on whether they guessed correctly or not.
 */

public class DiceRoll {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Hello, let's roll some dice! "
				+ "Are you feeling lucky? \nEnter a number between 1 and 6: ");
		int guess = s.nextInt();
		System.out.print("Let's make this more interesting. How much would you "
				+ "like to bet? (I will give you 3/1 odds) \nEnter a dollar amount: ");
		double bet = s.nextDouble();
		s.close();
		System.out.println("Rolling...");
		int roll = (int) (Math.random() * 6) + 1;
		System.out.format("And the number was %d", roll);
		if (guess == roll) {
			double winnings = bet * 3;
			System.out.format("\nCongratulations!\nYou won $%.2f, your total "
					+ "payout is $%.2f", winnings, winnings + bet);			
		} else {
			System.out.format("\nSorry! Looks like you lost!\nYou lost $%.2f", bet);			
		}
		System.out.println("\nThanks for playing :)");			
	}

}
