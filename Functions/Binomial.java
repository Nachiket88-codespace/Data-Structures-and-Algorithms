import java.util.* ;
public class Binomial {

    public static int factorial(int num){
        int fact= 1 ;
        for(int i=1 ; i<=num ; i++){
            fact = fact*i ;
        }
        
        return fact ;
    }

    public static int Binomial_coeff(int n , int r){
        int fact_n = factorial(n) ;
        int fact_r = factorial(r) ;
        int fact_n_r = factorial((n-r)) ;

        int bino_ans = ((fact_n) / ((fact_r)*(fact_n_r)));

        return bino_ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter n value = ");
        int num_n = sc.nextInt() ; 
        System.out.print("enter r value = ");
        int num_r = sc.nextInt() ; 

        int ans = Binomial_coeff(num_n, num_r) ; 

        System.out.print("binomial ans is = " + ans);

        sc.close();
    }
}