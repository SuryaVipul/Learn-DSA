package Array;

// Find the Second-Largest Number in an array
public class SecondLargest {

    public static String findSecondLargest(int[] a) {
        if (a.length < 2) {
            return"Array should have at least two numbers";
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j > secondLargest && j != firstLargest) {
                secondLargest = j;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? "No second largest found" : String.valueOf(secondLargest);
    }

    

    public static void main(String[] args) {
        SecondLargest p4 = new SecondLargest();

        //int[] arr = {4, 9, 0, 2, 8, 7, 1};
        // int[] arr = {8,2};
        // int[] arr = {8,8};
        //int[] arr = {4,3,4,4};
       // int[] arr = {-5, -1, -3, -2};
       // int[] arr = {9, 8, 7, 6};
        int[] arr = {15};

        System.out.println(p4.findSecondLargest(arr));

    }
}
