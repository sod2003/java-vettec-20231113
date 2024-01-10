package Week08;

public class RecursionExample {

    // Solving the factorial of an integer. (e.g. 2! = 2 x 1 = 2, 3! = 3 x 2 x 1 = 6)
    public static int iterativeFactorial(int n) {
        int answer = 1;
        for(int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        return answer;
    }

     // Solving the factorial of an integer. (e.g. 2! = 2 x 1 = 2, 3! = 3 x 2 x 1 = 6)
    public static int recursiveFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(30000));
        System.out.println(recursiveFactorial(30000));
    }

}
