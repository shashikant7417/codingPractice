package Pattrens;

public class Diamond {
    public static void main(String[] args) {
         int n = 4;
         // Upper half
         for (int i = 1; i <= n ; i++) {
             // Print spaces
             for (int j = 1 ; j <= n-i ; j++) {
                 System.out.print(" ");
             }
             //Print numbers
             for (int j =1; j<= 2 * i-1; j++){
                 System.out.print("*");
             }
             System.out.println();
         }

         // Lower Half
        for (int i = n ; i >= 1 ; i--) {
            // Print spaces
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Print numbers
            for (int j =1; j<= 2 * i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
