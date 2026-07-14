import java.util.*;
public class Decimal_toBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter dec_num = ");
        int dec_num = sc.nextInt() ; 
        int power = 0 ;
        int bin_num = 0 ;
        int temp = dec_num ; 

        while(temp > 0){
            int remainder = temp % 2 ;
            temp = temp / 2 ; 
            bin_num = bin_num + ((remainder)*(int)Math.pow(10, power)) ; 
            power++ ; 
        }

        System.out.println(bin_num);
        sc.close();
    }
}