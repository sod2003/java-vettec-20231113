package Week11.Multithreading;

public class MTIntro extends Thread{
    private int id;

    public MTIntro(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        int i = 0;
        while(i++ < 5) {
            long time = (long) (Math.random() * 100);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " in Thread: " + this.id);
        }
    }
}