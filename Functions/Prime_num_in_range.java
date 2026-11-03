import java.util.*;
public class Prime_num_in_range {

    public static void check_prime(int number){
        boolean is_prime = true ; 
        if(number <= 1){
            System.out.print("number is not prime ");
            System.out.println();
        }
        else if(number == 2){
            System.out.print("number 2 is prime");
            System.out.println();
        }
        else if(number > 2){
            for(int i=2 ; i<=(number-1) ; i++){
                if(number%i == 0){
                    is_prime = false ; 
                }
            }
            if(is_prime == true){
            System.out.println(number + " is prime num ");
            System.out.println();
        }
        else{
            System.out.print(number + " is not prime");
            System.out.println();
        }
        }
    }
    public static void prime_in_range(int new_num){
        for(int k=1 ; k<=new_num ; k++){
            check_prime(k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter number : ");
        int nums = sc.nextInt() ; 

        prime_in_range(nums);

        sc.close();
    }
}