import java.util.* ;
public class Prime_num_in_range {


    public static void check_prime(int num){
        boolean is_prime = true ;
        for(int i=2 ; i<=Math.sqrt(num) ; i++){
            if(num % i == 0){
                is_prime = false ;
            }
        }

        if(is_prime == true){
            System.out.println(num);
        }
    }

    

    public static void check_prime_in_range(int last_value){
        for(int j=2 ; j<=last_value ; j++){
            check_prime(j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter last value of range : ");
        int last_digit = sc.nextInt() ;

        check_prime_in_range(last_digit);

        sc.close();
    }
}