import java.util.*;
public class PALLINDROME_NUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int num = sc.nextInt() ; 
        int temp = num ;
        int rev_num = 0 ;

        while(temp>0){
            int remainder = temp % 10 ;
            temp = temp / 10 ;
            rev_num = rev_num*10 + remainder;
        }

        if(num == rev_num){
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }

        sc.close();
    }
}
