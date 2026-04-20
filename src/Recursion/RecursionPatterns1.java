package Recursion;

public class RecursionPatterns1 {

    // Q1. Print Name 5 times
//    public void printName(int i, int n) {
//        if (i > n)
//            return;
//
//        System.out.println("surya");
//        printName(i+1,n);
//    }

    // Q2. print n to 1

//    public void print(int i, int n) {
//        if (n < i)
//            return;
//        System.out.println(n);
//        print(i,n-1);
//    }

    // Q3. print 1 to N; (Linear backtracking approach recursion)
//    public void print(int i, int n) {
//        if (i < 1)
//            return;
//        print(i - 1, n);
//        System.out.println(i);
//    }

    // Q4 print N to 1; (backtracking approach recursion)
//        public void print(int i, int n) {
//            if (i > n)
//                return;
//            print(i+1,n);
//            System.out.println(i);
//        }

     // Q5. sum of first n numbers
    // parameterized recursion approach

//    public void printSum(int i, int sum){
//           if (i < 1){
//               System.out.println(sum);
//               return;
//           }
//           printSum(i -1, sum + i);
//    }
//

    // Q6. sum of first n numbers
    // functional recursion approach

    public int printSum(int n) {

        if (n == 0)
            return 0;

        return n + printSum(n - 1);
    }

    public static void main(String[] args) {
        RecursionPatterns1 rb = new RecursionPatterns1();
        int n = 3;
       // rb.printName(1,n);
      //  rb.print(1,n);
       // rb.printSum(n,0); for Q5

        System.out.println(rb.printSum(n)); //for Q6

    }
}
