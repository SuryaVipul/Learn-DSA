package Recursion;

public class RecursionPatterns2 {

    // Q1. Reverse an array using recursion.
    // (using two pointer approach)
//    public void reverseArray(int[] a, int i, int r) {
//        if (i >= r)
//            return;
//
//        int temp = a[i];
//        a[i] = a[r];
//        a[r] = temp;
//
//        reverseArray(a, i + 1, r - 1);
//    }


    // Q2. Reverse an array using recursion.
    // (using one pointer approach)
    public void reverseArray(int[] a, int i, int n) {
        if (i >= n/2)
            return;

        int temp = a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = temp;

        reverseArray(a, i+1, n);
    }

    public  void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        RecursionPatterns2 rb2 = new RecursionPatterns2();

        int[] a = {1, 2, 3, 4, 5};

        int n = a.length;
        int r = n - 1;

        int l = a.length;

        //rb2.reverseArray(a, 0, r); // for Q1
        rb2.reverseArray(a,0, l);
        System.out.println("Reverse array ");
        rb2.printArray(a);
    }
}