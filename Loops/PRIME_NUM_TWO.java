import java.util.* ;
public class PRIME_NUM_TWO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter any number : ");
        int number = sc.nextInt() ; 
        boolean is_prime_status = true ;

        for ( int i=2 ; i <= Math.sqrt(number) ; i ++ ){
            if (number % i == 0) {
                is_prime_status = false ; 
            }
        }
        if (is_prime_status == true ) {
            System.out.println(number + " is a prime number ");
        }
        else{
            System.out.println(number + " is not a prime number ");
        }

        sc.close();

    }
}
