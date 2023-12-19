package Week03;

public class ForLoopChallenge {

    public static void main(String[] args) {
        // Warm-up 1: Count to 100 by 2's
        for (int i=0; i<=100; i+=2) {
            System.out.println(i);
        }

        // Warm-up 2: Add up the numbers 1 to 10
        int result = 0;
        // YOUR CODE HERE
        for (int i=1; i<=10; i++) {
            result+=i;
        }
        System.out.println(result);

        // Calling challenge1
        System.out.println(challenge1("hello"));

        // Calling challenge2
        System.out.println(challenge2("hello"));

    }

    /**Reverse a String. 

       For example, given "Hello" it will return "olleH"
       @param s The String to reverse
       @return A new String containing the characters in reverse order
    */

        public static String challenge1(String s) {
            // YOUR CODE HERE
            String newString = "";
            for (int i=s.length()-1; i>=0; i--) {
                newString+=s.charAt(i);
            }
            return newString;
        }
    /** Capitalizes every other letter in a String. 
        For example, given "hello" it will return "HeLlO" 
        @param s The String to capitalize
        @return A new String with every other letter capitalized
    */
        public static String challenge2(String s) {// YOUR CODE HERE
            String newString = "";
            for (int i=0; i<s.length(); i++) {
                if (i%2==0) {
                    newString+=s.toUpperCase().charAt(i);
                    } else {
                    newString+=s.charAt(i);
                    }
                }
            return newString;
        }
}