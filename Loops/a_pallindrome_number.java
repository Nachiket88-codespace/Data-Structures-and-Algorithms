import java.util.*;
public class a_pallindrome_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("enter any number = ");
        int num = sc.nextInt() ;
        int temp_num = num ;
        int rev_num = 0 ;

        while(temp_num > 0){
            int remainder = temp_num % 10 ;
            temp_num = temp_num / 10 ;
            rev_num  = (rev_num * 10) + remainder ;
        }

        if(rev_num == num){
            System.out.print(num + " is a pallindrome number");
        }
        else{
            System.out.print(num + " is not a pallindrome number");
        }

        sc.close();
    }
}