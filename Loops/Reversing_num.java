import  java.util.*;
public class Reversing_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;

        System.out.print("enter any number which needs to be reversed : ");
        int number = sc.nextInt() ; 
        int last_digit ;
        int reversed_num = 0 ;

        while (number > 0 ){
            last_digit = number % 10 ;
            number /= 10 ;
            reversed_num = (reversed_num*10) + last_digit ;

        }
        System.out.println("reversed number of " + number + " is : " + reversed_num);
        sc.close();
    }
}
