package Week07.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MoreQueue {
    public static void main(String[] args) {
        Queue<String> peeps = new LinkedList<>();
        peeps.add("Bob");
        peeps.add("Jim");
        peeps.add("Tom");

        peeps.offer("Bobby");

        System.out.println(peeps);
        System.out.println(((LinkedList<String>) peeps).get(2));
    }
}
