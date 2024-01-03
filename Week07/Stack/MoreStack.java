package Week07.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class MoreStack {
    public static void main(String[] args) {
        Deque<Integer> stack1 = new LinkedList<>();
        System.out.println(stack1.peek());
        Deque<String> food = new LinkedList<>();
        food.push("Tuna");
        food.push("Rice");
        food.push("Tomato");
        food.push("Egg");
        food.push("Beans");
        System.out.println("In my pantry:");
        prettyPrintStack((LinkedList<String>) food);
    }

    public static <E> void prettyPrintStack(LinkedList<E> list) {
        System.out.println("---------------");
        System.out.println("|     TOP     |");
        System.out.println("---------------");
        for (E elem : list) {
            System.out.println(elem);
        }
        System.out.println("---------------");
    }
}
