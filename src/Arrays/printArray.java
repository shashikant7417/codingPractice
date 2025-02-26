package Arrays;

import java.util.Scanner;

public class printArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter names into the array : ");
        arr[0] = sc.next();
        arr[1] = sc.next();
        arr[2] = sc.next();
        arr[3] = sc.next();
        arr[4] = sc.next();

        System.out.println("Elements of array are as follows : ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
