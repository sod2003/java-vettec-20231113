package Week11.WednesdayAssignment;

import java.util.ArrayList;
import java.util.List;

public class Runner implements Runnable {
    private String name;
    private int distance;
    private Thread t;
    private int speed;
    private static List<Runner> finish = new ArrayList<Runner>();

    public Runner(String name, int distance) {
        this.name = name;
        this.distance = distance;
        t = new Thread(this);
    }

    @Override
    public void run() {
        while (distance < 100) {
            try {
                Thread.sleep(speed);
                distance += 25;
                System.out.println(name + " is at " + distance + " meters!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        finish.add(this);
        System.out.println(name + " crossed the finish line!");
    }

    public void race(int speed) {
        this.speed = speed;
        t.start();
    }

    private static void annouceWinners() {
        System.out.println("\nWe have a winner!\n");
        for (int i = 0; i < finish.size(); i++) {
            switch(i) {
                case 0:
                    System.out.println("In 1st place is " + finish.get(i).name + "!");
                    break;
                case 1:
                    System.out.println("In 2nd place is " + finish.get(i).name + "!");
                    break;
                case 2:
                    System.out.println("In 3rd place is " + finish.get(i).name + "!");
                    break;
            }
        }
        Runner.finish.clear();
    }
    
    public static void main(String[] args) {
        // Creating the Runners
        Runner runner1 = new Runner("Hunter", 0);
        Runner runner2 = new Runner("Sam", 0);

        // Calling internal method that sets the speed of the runner and runs thread to initial the race
        runner1.race(1000);
        runner2.race(750);
        
        // A join block to wait for all runners to cross the finish line before annoucing the winners
        try {
            runner1.t.join();
            runner2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Runner.annouceWinners();
        }
    }
}
