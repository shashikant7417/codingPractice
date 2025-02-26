package Strings;

public class ReplaceLetterInString {

    public static void main(String[] args) {

        String result = "";

        String str = "xyzxy";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 's'){
                result += 'p';
            }else {
                result += str.charAt(i);
            }

        }
        System.out.println(result);

    }
}
