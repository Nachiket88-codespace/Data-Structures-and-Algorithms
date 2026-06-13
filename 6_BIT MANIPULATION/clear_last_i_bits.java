import java.util.Scanner;

public class clear_last_i_bits {

    public static int cleared_bits(int number , int index){
        int bitmask = (-1)<<index ; 
        int ans = number & bitmask ; 

        return ans ; 
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;
        System.out.print("enter which how many bits  = ");
        int i = sc.nextInt() ; 

        System.out.println(cleared_bits(dec_num, i));
        sc.close();
    }
}
