import java.util.Scanner;

public class get_ith_bit {

    public static int get_indexed_bit(int binary_num , int index){
        int bitmask = 1<<index ; 
        if((binary_num & bitmask) == 0){
            return 0 ;
        }
        else{
            return 1 ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any binary number = ");
        int bin_num = sc.nextInt() ;
        System.out.print("enter which index bit is to be returned = ");
        int i = sc.nextInt() ; 

        System.out.println(get_indexed_bit(bin_num, i));
        sc.close();
    }
}
