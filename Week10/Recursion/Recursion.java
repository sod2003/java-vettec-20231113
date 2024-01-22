package Week10.Recursion;

public class Recursion {
    public static void main(String[] args) {
        doStuff(3);
    }

    private static void doStuff(int count) {
        if(count < 1) {
            System.out.println("Done!");
            return;
        }
        System.out.println("Doing stuff " + count);
        doStuff(count - 1);
    }
}
