package ProgrammingSheet150;

public class SumOfNaturalNumbers {

    public int calculate(int num) {
        int sum = 0;

     /*   for (int i = 0; i<= num; i++) {
            sum = sum + i;
        }
        return sum;*/
        sum = num * (num+1)/2;
        return sum;
    }

    public static void main(String[] args) {
        SumOfNaturalNumbers sm = new SumOfNaturalNumbers();
        int n = 10;
        int result = sm.calculate(n);
        System.out.println(result);
    }
}
