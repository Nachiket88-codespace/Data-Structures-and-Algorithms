import java.util.*;
public class Prime_num_in_range {


    public static void prime_check(int num){
        boolean is_prime = true ; 
        if(num == 2){
            System.out.println("2 is a prime number");
        }
        else if(num != 2 ){
            for(int i=2 ; i<=Math.sqrt(num) ; i++){
                if(num % i == 0){
                    is_prime = false ; 
                }
            }

            if(is_prime == true){
            System.out.println(num);
        }
    }

 }

    public static void prime_range(int range){
        for(int j=2 ; j<=range ; j++){
            prime_check(j);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter last digit of the search = ");
        int last_num = sc.nextInt() ; 

        prime_range(last_num) ; 
        sc.close();
    }
}