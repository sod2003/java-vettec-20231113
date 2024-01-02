package Week07;
import java.util.LinkedList;

public class TuesdayAssignment {
    public static String reverse(String str) {
        LinkedList<Character> chars = new LinkedList<>();
        // YOUR CODE HERE (Hint: Use a loop and the stack methods push and pop)
        for (char c : str.toCharArray())  {
            chars.push(c);
        }
        String reversedString = "";
        while (!chars.isEmpty()) {
            reversedString += chars.pop();
        }
        return reversedString;
    }

    public static boolean isBalanced(String expression) {
        LinkedList<Character> parenthesis = new LinkedList<>();
        // YOUR CODE HERE (Hint: Use a loop and the stack methods push and pop)
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                parenthesis.push(c);
            } else if (c == ')') {
                if (parenthesis.isEmpty()) {
                    return false;
                }
                parenthesis.pop();
            }
        }
        if (!parenthesis.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abc123";
        System.out.println("String is " + str);
        System.out.println("Reversed string is " + reverse(str));

        String unbalanced = "())";
        System.out.println("Is " + unbalanced + " balanced? " + isBalanced(unbalanced));
        unbalanced = "((" + unbalanced;
        System.out.println("Is " + unbalanced + " balanced? " + isBalanced(unbalanced));
        String balanced = "((()))";
        System.out.println("Is " + balanced + " balanced? " + isBalanced(balanced));
    }
}
