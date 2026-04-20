package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(-1);
        arrayList.add(10);
        arrayList.add(15);

        System.out.println(arrayList);

        for (int arr : arrayList) {
            System.out.print(arr + " ");
        }
        System.out.println();
        Iterator<Integer> itr = arrayList.iterator();

        while (itr.hasNext()) {
            int data = itr.next();
            System.out.print(data + " ");
        }

        System.out.println();
        arrayList.remove(3);
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));

        arrayList.set(2,7);
        System.out.println(arrayList);

        System.out.println(arrayList.size());

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.addAll(arrayList);

        System.out.println(arrayList1);

        System.out.println(arrayList.isEmpty());

        arrayList.clear();

        System.out.println(arrayList.isEmpty());

    }
}
