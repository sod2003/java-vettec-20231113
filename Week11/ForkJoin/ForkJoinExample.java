package Week11.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// Our Main Task extends ForkJoinTask, or one of its subtypes like RecursiveTask.
class ForkJoinWork extends RecursiveTask<Integer> {
    int[] nums;
    int start, end;
    int searchElement;
    
    public ForkJoinWork(int[] nums, int start, int end, int searchElement) {
        this.nums = nums;
        this.start = start;
        this.end = end;
        this.searchElement = searchElement;
    }

    // This is the method that must be overidden by a subclass of ForkJoinTask, or RecursiveTask in this case.
    @Override
    protected Integer compute() {
        return frequency();
    }

    // Returns a count of the frequency of a number within the array.
    private Integer frequency() {
        int count = 0;

        for (int j = start; j <= end; j++) {
            if (nums[j] == searchElement) {
                count++;
            }
        }
        return count;  
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] nums = { 50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99 };
        int searchElement = 50;
        int start = 0;
        int end = nums.length - 1;

        // Creating an instance of the ForkJoinPool class using a static method, ForkJoinPool.commonPool(), 
        // but 'new ForkJoinPool()' or 'new ForkJoinPool(int p)' can also be used. 
        ForkJoinPool pool = ForkJoinPool.commonPool();

        // Creating an instance of my ForkJoinWork class.
        ForkJoinWork workTask = new ForkJoinWork(nums, start, end, searchElement);

        // Submitting the task to the ForkJoinPool
        int frequency = pool.invoke(workTask);

        System.out.println("Total number of active threads after invoking: " + pool.getActiveThreadCount());  
  
        System.out.println("The size of the Common Pool is: " + pool.getPoolSize());

        System.out.println("The number " + searchElement + " is found " + frequency + " times.");
    }
}