package Strings;

public class UserNameFromEmail {
    public static void main(String[] args) {
        String email = "Ahiransh@gmail.com";
        String username = "";

        for(int i =0; i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else {
                username += email.charAt(i);
            }
        }

        System.out.println(username);
    }
}
