import java.util.Scanner;

public class check_even_odd {

    public static void check_num(int n){
        int bit_mask = 1 ; 
        if((n & bit_mask) == 0){
            System.out.println("even number ");
        }
        else{
            System.out.println("odd number ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any decimal number = ");
        int dec_num = sc.nextInt() ;

        check_num(dec_num);
        sc.close();
    }
}
