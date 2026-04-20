package Array;

// Write a function that returns the number of negative numbers in an array

public class NegativeNumbers {

    int countNegatives(int[] a) {
        int count = 0;

        for (int j : a) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2,-9,-17,0,-1,10,-4,8};

        NegativeNumbers negativeNumbers = new NegativeNumbers();
        int result = negativeNumbers.countNegatives(arr);
        System.out.println(result);
    }
}
