package oops;

public class ArrayPractice2 {

    public static void main(String[] args) {

        // Left Rotation of an array

        int[] A = {2,3,14,12,10};

        System.out.println("Printing below Original Array");

        for(int x: A){
            System.out.print(x +" ");
        }
        System.out.println();

        int temp = A[0];
        for(int i = 1; i < A.length; i++) {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;

        System.out.println("Below is the Left rotation of array");

        for(int x: A){
            System.out.print(x +" ");
        }
        System.out.println();

//   *********************************************************************

        // Right Rotation of an array

        int[] A2 = {15,8,12,3,1,33};

        System.out.println("Printing again below Original Array");

        for(int x : A2) {
            System.out.print(x + " ");
        }
        System.out.println();
        int temp1 = A2[A2.length-1];
        for (int i = A2.length-1; i > 0; i--) {
                A2[i] = A2[i-1];
        }
        A2[0] = temp1;
        System.out.println("Below is the Right rotation of array");
        for (int x : A2) {
            System.out.print(x + " ");
        }
        System.out.println();

        //   *********************************************************************

        // insert an Element

        int A3[] = new int[7];
        A3[0] = 5;
        A3[1] = 9;
        A3[2] = 10;
        A3[3] = 12;
        A3[4] = 7;
        A3[5] = 15;

        System.out.println("Printing again below Original Array");
        for(int x : A3) {
            System.out.print(x + " ");
        }
        System.out.println();
        int n = 6;
        int index = 4;
        for (int i = A3.length-1; i > index; i--) {
            A3[i] = A3[i-1];
        }
        A3[index] = n;
        System.out.println("Inserted an element to an array");
        for (int x : A3) {
            System.out.print(x + " ");
        }
        System.out.println();

        //   *********************************************************************
        // Delete an Element

        int[] A4 = {2,3,14,12,10};

        System.out.println("Printing again below Original Array");
        for(int x : A4) {
            System.out.print(x + " ");
        }
        System.out.println();
        int elementToDelete = 14;
        int index1 = -1;

        // Step 1: Find index
        for (int i = 0; i < A4.length; i++) {
            if (A4[i] == elementToDelete) {
                index1 = i;
                break;
            }
        }
        if (index1 != -1) {
            for (int i = index1; i < A4.length - 1; i++) {
                A4[i] = A4[i + 1];
            }
        }
        System.out.println("Deletion an element to an array");
        for (int i = 0; i < A4.length - 1; i++) {
            System.out.print(A4[i] + " ");
        }

        System.out.println();

    }
}
