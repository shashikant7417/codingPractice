package Functions;

import java.util.Scanner;

public class Sum {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int product(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an First Number");
        int x = sc.nextInt();
        System.out.println("Enter an Second Number");
        int y = sc.nextInt();

//        int sum = sum(x, y);
//        System.out.println("Sum of two numbers is : " +  sum);

        int product = product(x, y);
        System.out.println("Product of two numbers is : " +  product);


    }
}
