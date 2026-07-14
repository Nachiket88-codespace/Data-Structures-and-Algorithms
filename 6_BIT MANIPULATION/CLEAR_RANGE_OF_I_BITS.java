import java.util.Scanner;

public class CLEAR_RANGE_OF_I_BITS {

    public static int clear_range_of_bits(int num , int i , int j){
        int a = (~0)<<(j+1) ; 
        int b = (1<<i)-1 ; 
        int bitmask = a | b ; 
        
        int ans = num & bitmask ; 
        return ans ; 
   }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;
        System.out.print("enter which 1st index bit  = ");
        int i = sc.nextInt() ; 
        System.out.print("enter which 2nd index bit  = ");
        int j = sc.nextInt() ; 

        System.out.println(clear_range_of_bits(dec_num, i, j));
        sc.close();
    }
}
