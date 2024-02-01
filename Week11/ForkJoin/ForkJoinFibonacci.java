package Week11.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFibonacci extends RecursiveTask<Integer> {
    final int n;

    ForkJoinFibonacci(int n) { 
        this.n = n; 
    }

    protected Integer compute() {
        if (n <= 1)
            return n;
        ForkJoinFibonacci f1 = new ForkJoinFibonacci(n - 1);
        f1.fork();
        ForkJoinFibonacci f2 = new ForkJoinFibonacci(n - 2);
        return f2.compute() + f1.join();
    }

    public static void main(String[] args) {
        ForkJoinFibonacci fib = new ForkJoinFibonacci(25);

        ForkJoinPool pool = ForkJoinPool.commonPool();

        int fibonacci = pool.invoke(fib);

        System.out.println("The fibonacci number returned is: " + fibonacci);
        System.out.println("Total number of active threads after invoking: " + pool.getActiveThreadCount());  
        System.out.println("The size of the Common Pool is: " + pool.getPoolSize());
        System.out.println("The number of incidents of stolen work: " + pool.getStealCount());
    }
}
