package ProgrammingSheet150;

public class CheckLeapYear {

    public void check(int year) {
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a Leap Year");
        }
        else if (year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        }

    }

    public static void main(String[] args) {
        CheckLeapYear cy = new CheckLeapYear();
        int n = 2020;
        cy.check(n);
    }
}
