import java.util.Scanner;

public class update_ith_bit {

    public static int clear_bit(int num , int index){
        int bitmask = ~(1<<index) ; 
        int ans = num & bitmask ; 

        return ans ; 
    }

    public static int update_bit(int number , int index_bit , int new_bit){
        int num_s = clear_bit(number, index_bit) ; 
        int new_bitmask = new_bit << index_bit ; 
        int answer = num_s | new_bitmask ; 

        return answer ; 


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;
        System.out.print("enter which index bit  = ");
        int i = sc.nextInt() ; 
        System.out.print("enter new_bit = ");
        int new_bit = sc.nextInt() ; 

        System.out.println(update_bit(dec_num, i, new_bit));
        sc.close();
    }
}