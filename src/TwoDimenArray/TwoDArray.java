package TwoDimenArray;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Input rows and colum of two dimensional array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter values of array :");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Input number to be searched");
        int number = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == number)
                    System.out.println("Number found at index ("+i+","+j+")");

            }
        }


    }
}
