package Pattrens;

public class PalindromePyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n ; i++) {
            //Print Spaces
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Print first half numbers
            for (int j = i; j>=1 ; j--) {
                System.out.print(j);
            }
            // print second half numbers
            for (int j = 2; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
