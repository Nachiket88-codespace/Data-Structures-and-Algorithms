// import java.util.* ; 
public class Factorial {
    public static int factorial_calc(int number){
        int fact = 1 ;

        for(int i = 1 ; i <= number ; i++){
            fact = fact*i ;
        }
        return fact ; 
    }
    public static void main(String[] args) {
         int answer = factorial_calc(4) ; 
         System.out.println(answer);

        
    }
}
