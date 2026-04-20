package Array;


// Write a function that searches for an element in an array and returns the index, if the element is not present then just return -1

public class SearchInArray {

  //  Approach 1: Brute Force
    public int find(int[] a, int find) {
        for(int i =0; i <= a.length-1; i++) {
            if (a[i] == find) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,10,8,30};
        int element = 3;

        SearchInArray search = new SearchInArray();
        int result = search.find(arr,element);
        System.out.println(result);
    }
}
