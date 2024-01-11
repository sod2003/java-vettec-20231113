package Week08.FunctionalInterfaces;
// import java.util.Scanner;

public class Driver {
    public static void findNumberGivenCriteria(FindBiggest<Integer> fb) {
        // Scanner sc = new Scanner(System.in);
        int[] ints = new int[]{1, 2, 3};
        // for(int i = 0 ; i< ints.length; i++) {
        //     System.out.println("Please enter a number: ");
        //     ints[i] = Integer.parseInt(sc.nextLine());
        // }
        
        System.out.println(fb.compare(ints[0], ints[1], ints[2]));

        // sc.close();
    }

    public static void main(String[] args) {
        findNumberGivenCriteria(new FindBiggestInteger());
        
        FindBiggest<Integer> sum =  (int1, int2, int3) -> {
            return int1 + int2 + int3;
        };
        findNumberGivenCriteria(sum);
    }
}
