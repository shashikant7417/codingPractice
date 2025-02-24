package Arrays;

import java.util.Scanner;

public class searchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == element){
                System.out.println("Element found at index " + j);
            }
        }
    }
}
