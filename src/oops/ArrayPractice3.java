package oops;

public class ArrayPractice3 {

    public static void main(String[] args) {

        // 1 Find Largest and Smallest Element

        int[] A = {4, 2, 9, 1, 7};
        System.out.println("Printing original Array");
        for (int x : A) {
            System.out.print(x +" ");
        }
        System.out.println();
        int max = 0;
        for (int x : A) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Largest " + max);

        int min = 0;
        for (int i = 0; i < A.length-1 ; i++) {
            if (A[i] > A[i+1])
                min = A[i+1];
        }
        System.out.println("Smallest " + min);

        //        *********************************************************************

      //  2 Reverse an Array (In-place)

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Printing original Array");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
