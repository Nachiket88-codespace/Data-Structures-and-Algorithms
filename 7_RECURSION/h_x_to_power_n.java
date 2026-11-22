import java.util.Scanner;

public class h_x_to_power_n {
    
    public static int power(int num , int pow_n){

        if(pow_n == 0){
            return 1 ;
        }

        int pnm1 = power(num, pow_n-1) ;
        int pn = num * pnm1 ; 

        return pn ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ;
        System.out.println("enter power : ");
        int pow_n = sc.nextInt() ; 

        System.out.println(power(num, pow_n));

        sc.close();
    }
}
