package Functions;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 15;

        while(n1 != n2){
            if(n1>n2){
                n1 = n1-n2;
            }else
                n2 = n2 -n1;
        }
        System.out.println(" Greatest Common divisor :" + n2);
    }
}
