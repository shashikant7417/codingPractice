package Arrays;

import java.util.Scanner;

public class minAndMaxValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of any array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value is : " + min);

        System.out.println("Maximum value is : " + max);
    }

}