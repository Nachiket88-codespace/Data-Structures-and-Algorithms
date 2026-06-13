import java.util.Scanner;

public class set_ith_bit {

    public static int return_set_bit(int num , int index){
        int bitmask = 1<<index ; 
        int ans = num | bitmask ; 

        return ans ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;
        System.out.print("enter which index bit is to be returned = ");
        int i = sc.nextInt() ; 

        System.out.println(return_set_bit(dec_num, i));
        sc.close();

    }
}