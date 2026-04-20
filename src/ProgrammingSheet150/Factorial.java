package ProgrammingSheet150;

//Automating Factorial Calculation for Combinatorics

public class Factorial {

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;

        // come back to this problem after understanding the recursion concept then solve it
        // using recursion
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int num = 7;
        int result = f.factorial(num);
        System.out.println(result);

    }
}
