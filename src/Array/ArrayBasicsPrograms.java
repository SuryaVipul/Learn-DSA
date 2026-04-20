package Array;

public class ArrayBasicsPrograms {

    //Count Even and Odd Numbers in an Array
    public void  countEvenOdd(int[] arr) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                 countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("countEven " + countEven);
        System.out.println("countOdd " + countOdd);
    }

    //Find the Sum of All Elements
    public int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Find the Average of Array Elements
    public int findAvg(int[] arr) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count ++;
        }
         avg = sum / count;

        return avg;
    }

    //  Reverse an Array
    public void reverseArray (int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    // Find the Index from an array
    public int findIndex(int[] arr) {
        int key = 10;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // Count Occurrence of a Given Number

    public int countValue(int[] arr) {
        int key = 12;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    // Find the Maximum Difference Between Two Elements

    public int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= 0) {
//                return -1;
//            }
          //  else {
                if (arr[i] > largest) {
                    largest = arr[i];
              //  }
            }
        }
        return largest;
    }

    public int findSmallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= 0) {
//              return -1;
//            }
          //  else {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
          //  }
        }
        return smallest;
    }

    // Print All Duplicate Elements in an Array
    public void findDuplicate(int[] arr) {
         Integer duplicates = null;
        for (int i = 1; i < arr.length; i++) {
            if (duplicates == null) {
                if (arr[i] == arr[i-1]){
                    System.out.print(arr[i] + " ");
                    duplicates = arr[i];
                }
            }
            else if (duplicates != arr[i]) {
                duplicates = null;
            }
        }
    }
    // Count the Number of Positive and Negative Numbers

    public void countPosNegNumbers(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 ) {
                negCount++;
            }
            else if (arr[i] > 0)
            {
                posCount++;
            }
        }
        System.out.println("Positive numbers count : "+posCount);
        System.out.println("Negative numbers count : "+negCount);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,13,-2,-2};
        ArrayBasicsPrograms a = new ArrayBasicsPrograms();

        a.countEvenOdd(arr);
        int[] arr1 = {-2,-3,-4,-5,-6,0,-0};
        int result = a.findSum(arr1);
        System.out.println("sum from array is " + result);
        int[] arr2 = {10,20,30,40};
        int avgResult = a.findAvg(arr2);
        System.out.println("Average from array is " + avgResult);
        a.reverseArray(arr1);
        int indexResult = a.findIndex(arr2);
        System.out.println();
        System.out.println("the index of given key is " + indexResult);
        int[] arr3 = {15,2,4,8,9,12,2,3,4,8,2,15};
        int countResult = a.countValue(arr3);
        System.out.println("The Occurrence count of given number is " + countResult);
        //int[] arr4 = {2,7,9,5,-1};
        int[] arr4 = {-2,-7,-9,-5,-1};
        int largestRes = a.findLargest(arr4);
        int smallestRes = a.findSmallest(arr4);
        System.out.println("The Largest number is " + largestRes);
        System.out.println("The smallest number is " + smallestRes);
        System.out.println("The Difference between these 2 elements -: "+(largestRes - smallestRes));

        //int[] arr5 = {1,2,3,1,4,2,5};
        int[] arr5 = {2,2,2,2,3,3,3,3,4,5,5,6,6};
        System.out.println("Below are the duplicate elements from an array ");
        a.findDuplicate(arr5);
        System.out.println();

        int[] arr6 = {-3,4,-1,7,0,-5};
        System.out.println("Below are the Positive Numbers Count and Negative Numbers Count ");
        a.countPosNegNumbers(arr6);
    }
}
