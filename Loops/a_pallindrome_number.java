import java.util.*;
public  class a_pallindrome_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("enter any number : ");
        int number = sc.nextInt() ; 
        int rev_number = 0 ; 
        int temp = number ; 

        while (temp>0) {
            int remainder = temp%10 ; 
            rev_number = rev_number*10 + remainder ; 
            temp = temp/10 ; 
        }

        System.out.println("reversed number is = " + rev_number);
        if(number == rev_number){
            System.out.println("entered number is a pallindrome number");
        }
        else{
            System.out.println("entered number is not pallindrome");
        }

        sc.close() ; 
    }
}