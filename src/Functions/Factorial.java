package Functions;

import java.util.Scanner;

public class Factorial {

    public static void factorial(int n) {
        if (n == 0){
            System.out.println("Factorial is : " +1);
            return;
        }
        if (n < 0) {
            System.out.println(n + " is negative hence factorial cant be calculated");
            return;
        }
            int ans =1;
            for(int i = n; i >= 1 ; i--){
                ans *=  i;


        }
        System.out.println("Factorial of " + n + " is : " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial : ");
        int n = sc.nextInt();
        factorial(n);

    }
}
