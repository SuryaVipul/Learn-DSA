package ProgrammingSheet150;

//Summing the Digits to Find the Digital Root

public class GCD {

    // naive method
    public int calc(int a, int b) {
        int i = 0;
        if (a > b) {
             i = b/2;
            while (i >= 1){
                if (a % i == 0 && b % i == 0) {
                    break;
                }
                i--;
            }
        }
        else if (a < b) {
             i = a/2;
            while (i >=1){
                if (a % i == 0 && b % i == 0) {
                    break;
                }
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int n1 = 7;
        int n2 = 13;

        int result = gcd.calc(n1,n2);
        System.out.println(result);
    }
}
