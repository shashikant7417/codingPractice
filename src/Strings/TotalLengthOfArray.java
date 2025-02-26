package Strings;

public class TotalLengthOfArray {
    public static void main(String[] args) {

        String[] strArr = {"apple","banana","mango","orange"};
        int totalLength = 0;

        for(int i=0;i<strArr.length;i++) {
            totalLength += strArr[i].length();
        }
        System.out.println("Total length of array is: "+totalLength);
    }
}
