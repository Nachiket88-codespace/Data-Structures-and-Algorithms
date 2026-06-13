import java.util.Scanner;

public class clear_ith_bit {

    public static int clear_bit(int num , int index){
        int bit_mask = ~(1<<index) ; 
        int ans = num & bit_mask ; 

        return ans ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;
        System.out.print("enter which index bit is to be returned = ");
        int i = sc.nextInt() ; 

        System.out.print(clear_bit(dec_num, i));
        sc.close();
    }
}
