import java.util.*;
public class Binomial {

    public static int factorial(int num){
        int fact = 1 ;
        for(int i=1 ; i<=num ; i++){
            fact = fact * i ; 
        }

        return fact ; 
    }

    public static int binomial_ans(int n , int r){
        int n_val = factorial(n) ; 
        int r_val = factorial(r) ; 
        int n_r_val = factorial((n-r)) ; 

        int Ans = ((n_val)/((r_val)*(n_r_val))) ;
        return Ans ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter value of n = ");
        int n = sc.nextInt() ; 
        System.out.print("enter value of r = ");
        int r = sc.nextInt() ; 

        System.out.println(binomial_ans(n, r));
        sc.close();
    }
}