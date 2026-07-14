import java.util.*;
public class palindrome_string{

    public static boolean string_palindrome_check(String str_check){
        for(int i=0 ; i<str_check.length() ; i++){
            int n_len = str_check.length() ; 
            if(str_check.charAt(i) != str_check.charAt(n_len-i-1)){
                return false ; 
            }
        }
        return true ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter anything of string data type : "); 
        String word = sc.nextLine() ; 

        boolean status = string_palindrome_check(word) ;
        if(status == true){
            System.out.print(word + " is a palindrome string ");
        }
        else{
            System.out.print(word + " is not a palindrome string ");
        }
        sc.close();

    }
}
