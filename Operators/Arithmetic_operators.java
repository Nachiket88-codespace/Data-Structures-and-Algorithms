import java.util.* ;
public class Arithmetic_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 

        System.out.println("enter the two numbers below = ");
        float num = sc.nextFloat() ; 
        float num_2 = sc.nextFloat() ;

        double sum = num + num_2 ; 
        double subtraction = num_2 - num ; 
        double product = num*num_2 ; 
        double division = num / num_2 ; 
        double modulo = num_2 % num ; 

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(product);
        System.out.println(division);
        System.out.println(modulo);

        sc.close();
    }
}
