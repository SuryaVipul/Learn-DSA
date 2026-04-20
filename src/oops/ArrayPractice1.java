package oops;


public class ArrayPractice1 {
    public static void main(String[] args) {

       // int A[] = {3,9,7,8,12,36,15,5,45,25};
         int[] A = {2,3,14,12,10,13};
        // Find sum of all Elements
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.out.println("Sum is "+ sum);

//        *********************************************************************

        //Searching an Element
        int searchElement = 10;
        for(int x: A) {
            if (searchElement == x) {
                System.out.println("Element is found");
               break;
            }
        }
//        *********************************************************************

        // Finding maximum Element
        int max = A[0];
        for(int x : A) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("max Element is "+max);

//        *********************************************************************

        // Finding Second Largest Element
        int max1, max2;
        max1 = max2 = A[0];

        for(int x : A) {
           if (x > max1) {
               max2 = max1;
               max1 = x;
           } else if (x > max2) {
               max2 = x;
           }
        }
        System.out.println("Second largest Element is "+max2);

    }
}
