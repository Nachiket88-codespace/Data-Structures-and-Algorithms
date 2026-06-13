import java.util.*;
public class Binary_to_Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter binary num = ");
        int bin_num = sc.nextInt() ; 

        int power = 0 ; 
        int dec_num = 0 ;
        int temp = bin_num ; 

        while (temp > 0){
            int last_digit = temp % 10 ;
            temp = temp / 10 ;
            dec_num = dec_num + (last_digit * (int)Math.pow(2, power)) ; 
            power++ ; 
        }

        System.out.println("decimal num is = " + dec_num);
        sc.close();
    }
}