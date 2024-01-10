package Week08.Array2D;

public class Array2DExample {
    public static void main(String[] args) {
        int [][] nums = new int[2][];
        nums[0] = new int[3];
        nums[1] = new int[3];
        nums[0][0] = 1;
        nums[0][1] = 3;
        nums[0][2] = 5;
        nums[1][0] = 1;
        nums[1][1] = 2;
        nums[1][2] = 3;
        System.out.println("Count: " + countElements(nums));
        System.out.println("Concatenated Array: " + concatenateArray(nums));
    }

    public static int countElements(int[][] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
                count++;
            }
        }
        return count;
    }

    public static String concatenateArray(int[][] nums) {
        String concatenatedString = "";
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                concatenatedString += nums[i][j] + " ";
            }
        }
        return concatenatedString;
    }
}
