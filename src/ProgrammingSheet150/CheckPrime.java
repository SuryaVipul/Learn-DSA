package ProgrammingSheet150;

// Solving the Prime Mystery in a Programming Contest

import static java.lang.System.exit;

public class CheckPrime {

    // brute force
  /*  public boolean check(int n) {

        if (n < 2)
          return false;

        for (int i = 2; i < n; i++) {
            if (n % i  == 0) {
                return false;
            }
        }
        return true;
    }*/

    // optimized approach
  /*  public boolean check(int n) {
        if (n == 1)
            return false;

        for ( int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return  true;
    }*/

    // more optimized approach
    public boolean check(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        CheckPrime cp = new CheckPrime();
        int number = 131;
        boolean result = cp.check(number);

        if (result){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

    }
}
