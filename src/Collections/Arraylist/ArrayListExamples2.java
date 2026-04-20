package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExamples2 {

    // Remove duplicate elements from ArrayList.
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arrayList) {

        ArrayList<T> newList = new ArrayList<T>();

        for (T data : arrayList) {

            if (!newList.contains(data)) {
                newList.add(data);
            }
        }

        return newList;

    }
    
    // Find maximum number in ArrayList.

    public static void main(String[] args) {
        Integer[] arr = {1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5};
        ArrayList<Integer> arrayList  = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Arraylist with duplicates " + arrayList);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(arrayList);
        System.out.println("Duplicates removed" + newList);


        // Maximum number
        Integer[] arr1 = {55,44,8,9,12,-77,-12,98,23,64};
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(arr1));
//        ArrayList<Integer> max = findMax(arrayList1);
//        System.out.println("Maximum Element " + max);
        Integer max1 =  Collections.max(arrayList1);
        System.out.println("Maximum Element using Collections class " + max1);
    }
}
