package Functions;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 7;

        int a = 0, b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            //find nth term
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }


        }
    }
}
