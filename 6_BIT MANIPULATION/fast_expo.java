import java.util.Scanner;
public class fast_expo {

    public static int expo(int num , int power){
        int ans = 1 ; 
        int a = num ; 
        while(power > 0){
        if((power & 1) != 0){
            ans = ans * a ; 
        }
        a = a*a ; 
        power = power>>1 ;
       }

        return ans ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter number = ");
        int num = sc.nextInt() ; 
        System.out.print("enter power : ");
        int pow = sc.nextInt() ; 

        System.out.println(expo(num, pow));
        sc.close();
    }
}