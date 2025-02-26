package Strings;

public class StringsDemo {

    public static void main(String[] args) {

        String str1 = new String("shashikant") ;
        String str2 = new String("shashikant") ;

       // System.out.println(str1.length());

        if(str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

//        String str3 = str1.concat(str2);
//        System.out.println(str1 + " " + str2);
//        System.out.println(str3.substring(5));
//        System.out.println(str3.toUpperCase());

//        for(int i =0; i<str.length(); i++){
//            System.out.println(str.charAt(i));
//        }

//        for(char c : str.toCharArray()) {
//            System.out.println(c);
//        }
    }
}
