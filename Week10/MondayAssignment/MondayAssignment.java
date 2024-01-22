package Week10.MondayAssignment;

public class MondayAssignment {
    
    public static int sumEvens(int start, int end) throws Exception {
        if(end < start) {
            throw new Exception("End is not allowed to be less than Start!");
        } else if(end == start) {
            return 0;
        }

        if(start % 2 == 0) {
            return start + sumEvens(start + 1, end);
        }

        return sumEvens(start + 1, end);
    }

    public static boolean containsLarger(int[] nums, int n, int fromIndex) throws Exception {
        if(fromIndex < 0 || fromIndex >= nums.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds!");
        }

        if(nums[fromIndex] > n) {
            return true;
        } else if(fromIndex + 1 == nums.length) {
            return false;
        }
        
        return containsLarger(nums, n, fromIndex + 1);
    }

    public static void main(String[] args) {
        try{
            // Problem 1
            System.out.println(sumEvens(1, 10));
            
            // Problem 2
            int[] tens = new int[]{100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
            System.out.println(containsLarger(tens, 50, 0)); // returns true
            System.out.println(containsLarger(tens, 50, 5)); // returns false
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
