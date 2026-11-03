import java.util.* ; 
public class Binomial {

    public static int factorial(int num){
        int fact = 1 ; 
        for(int i=1 ; i<=num ; i++){
            fact = fact*i ; 
        }
        return fact ; 
    }

    public static int Binomials(int n , int r){
        int n_fact = factorial(n) ; 
        int r_fact = factorial(r) ; 
        int n_r_fact = factorial(n-r) ; 

        int bino = (n_fact)/((r_fact)*(n_r_fact)) ; 

        return bino ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter value of n : ");
        int n_val = sc.nextInt() ; 
        System.out.print("enter value of r : ");
        int r_val = sc.nextInt() ;
        
        int ans = Binomials(n_val, r_val) ; 
        System.out.println(ans);

        sc.close();
    }
}