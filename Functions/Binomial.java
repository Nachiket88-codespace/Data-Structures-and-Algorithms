import java.util.* ; 
public class Binomial {
    public static int Fcatorial_fun(int number){
        int factorial = 1 ; 

        for(int i = 1 ; i <= number ; i++){
            factorial = factorial * i ; 
        }
        // System.out.println(factorial);
        return factorial ; 
    }

    public static int Binomial_calc(int n , int r ){
        int n_value = Fcatorial_fun(n) ; 
        int r_value = Fcatorial_fun(r) ; 
        int n_r_value = Fcatorial_fun((n-r)) ; 

        int Binomial_ans = (n_value)/((r_value) * (n_r_value)) ; 
        // System.out.println("binomial of : " + n + " , " + r + " is : " + Binomial_ans);

        return Binomial_ans ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter value of n : ");
        int a_num = sc.nextInt() ; 
        System.out.print("enter value of r : ");
        int b_num = sc.nextInt() ;
        
        int answer = Binomial_calc(a_num, b_num) ; 
        System.out.println(answer);

        sc.close();

    }
}
