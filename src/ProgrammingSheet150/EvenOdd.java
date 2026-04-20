package ProgrammingSheet150;

// Teaching a Sibling to Tell Even from Odd
public class EvenOdd {

    public boolean checkEvenOdd(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        EvenOdd ed = new EvenOdd();
        int number = 28;

       boolean result =  ed.checkEvenOdd(number);

       if (result)
           System.out.println("Even");
       else
           System.out.println("Odd");
    }
}
