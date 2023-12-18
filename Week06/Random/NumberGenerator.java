package Week06.Random;

import java.util.Random;

public class NumberGenerator {

    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
        System.out.println();
        
        // Generate a random int between 0 and 10
        int randomNum = (int)(Math.random() * 11);
        System.out.println(randomNum);
        
        // Random class example
        Random randomClass = new Random();
        int x = randomClass.nextInt();
        float y = randomClass.nextFloat();
        int z = randomClass.nextInt(10);
        System.out.println("nextInt(): " + x);
        System.out.println("nextFloat(): " + y);
        System.out.println("nextInt() with a bound of 10: " + z);
    }
}
