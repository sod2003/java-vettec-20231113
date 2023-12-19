package Week02;
import java.util.Scanner;

public class PlayTennis {

	public static void main(String[] args) {
		System.out.println("Welcome to the program for deciding if you");
        System.out.println("Should Play Tennis Today\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's look at the weather conditions.\n");

        if (isWeatherGood(scanner)) {
            System.out.println("Yes! Today is a great day to play tennis.");
        } else {
            System.out.println("No, today is not good tennis weather. Maybe go bowling.");
       }

       scanner.close();

	}
	
	public static boolean isWeatherGood(Scanner scanner) {
		System.out.println("Enter weather conditions(Sunny, Overcast, or Rain)");
		boolean weatherGood = false;
		String conditions = scanner.nextLine().toLowerCase();
		if (conditions.equals("overcast")) {
			weatherGood = true;
		} else if (conditions.equals("sunny")) {
			System.out.println("Enter if humidity is High or Normal");
			String humidity = scanner.nextLine().toLowerCase();
			if (humidity.equals("normal")) {
				weatherGood = true;
			}
		} else if (conditions.equals("rain")){
			System.out.println("Enter Wind conditions(Strong or Weak)");
			String wind = scanner.nextLine().toLowerCase();
			if (wind.equals("weak")) {
				weatherGood = true;
			}
		}
		
		return weatherGood;
    }

}
