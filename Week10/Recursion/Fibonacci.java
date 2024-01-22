package Week10.Recursion;

public class Fibonacci {
    private static Long[] nums = new Long[1000];
    
    static {
        nums[0] = (long) 0;
        nums[1] = (long) 1;
    }
    
    // Fibonacci with Memoization.
    public static long fibonacci(int n) {
        if(n <= 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        long fibMinus1;
        long fibMinus2;

        if(nums[n - 1] != null) {
            fibMinus1 = nums[n - 1];
        } else {
            fibMinus1 = fibonacci(n - 1);
            nums[n - 1] = fibMinus1;
        }

        if(nums[n - 2] != null) {
            fibMinus2 = nums[n - 2];
        } else {
            fibMinus2 = fibonacci(n - 2);
            nums[n - 2] = fibMinus2;
        }

        return fibMinus1 + fibMinus2;
    }

    public static int fibonacciNoMemo(int n) {
        if(n <= 1) {
            return n;
        }

        return fibonacciNoMemo(n - 1) + fibonacciNoMemo(n - 2);
    }

    public static void main(String[] args) {
        // With Memoization
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(8));

        // Without Memoization -> Recursive calls.
        System.out.println(fibonacciNoMemo(8));
    }
}
