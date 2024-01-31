package Week11.Multithreading;

public class MTMain {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            MTIntro myThread = new MTIntro(i);
            myThread.start();
        }
        // MTIntro myThread2 = new MTIntro();

        // myThread2.start();
        // myThread.run();
        // myThread2.run();
    }
}
