package Array;

// Write a function to return the largest number in an array

public class LargestAndSmallest {

    int findLargest(int[] a) {
        int max = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    // write a function to return smallest number in an array

    int findSmallest(int[] a) {

        int min = Integer.MAX_VALUE;

        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        LargestAndSmallest lm = new LargestAndSmallest();
       // int[] arr = {5, 1, 7, 10, 8, 17, 2};
        int[] arr = {-5, 1, -7, -10, -8, -17, 2};

        int result = lm.findLargest(arr);
        int result1 = lm.findSmallest(arr);
        System.out.println("Largest "+result);
        System.out.println("Smallest "+result1);
    }
}
