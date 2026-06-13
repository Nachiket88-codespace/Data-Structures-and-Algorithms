import java.util.*;
public class Properties_in_string {
    
    public static void print_string_letters(String str_word){
        for(int i=0 ; i<str_word.length() ; i++){
            System.out.print(str_word.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter anything of string data type : "); 
        String word = sc.nextLine() ; 

        // // length of string property :
        int string_length = word.length() ; 
        System.out.println("length of string is : " + string_length);
        System.out.println("length of string is : " + word.length());

        // // Concatenation of strings :
        System.out.print("enter anything of string data type : ");
        String word_1 = sc.nextLine() ; 
        System.out.print("enter anything of string data type : ");
        String word_2 = sc.nextLine() ; 
        String combine = word_1+" "+word_2 ; 
        System.out.println(combine);

        // CharAt method in strings : 
        System.out.print("enter anything of string data type : ");
        String new_word = sc.nextLine() ; 
        char char_at = new_word.charAt(1) ; 
        System.out.println(char_at);
        System.out.println("-------------------------------------------------------------------------");

        print_string_letters(new_word);
        sc.close();
    }
}
