package Week11.Multithreading;

public class MTRunnable {
    public static void main(String[] args) {
        RunnableTask task1 = new RunnableTask("Task 1");
        RunnableTask task2 = new RunnableTask("Task 2");
        RunnableTask task3 = new RunnableTask("Task 3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableTask implements Runnable {

    private String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task: " + taskName + " is running in the Thread: " + Thread.currentThread().toString());
        System.out.println(taskName + " is finished running!");
    }

}