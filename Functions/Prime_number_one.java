import java.util.*;
public  class Prime_number_one {

    public static void check_prime(int number){
        boolean is_prime = true ; 
        if(number <= 1){
            System.out.print("number is not prime ");
        }
        else if(number == 2){
            System.out.print("number 2 is prime");
        }
        else if(number > 2){
            for(int i=2 ; i<=(number-1) ; i++){
                if(number%i == 0){
                    is_prime = false ; 
                }
            }
            if(is_prime == true){
            System.out.println(number + " is prime num ");
        }
        else{
            System.out.print(number + " is not prime");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter any number : ");
        int nums = sc.nextInt() ; 

        check_prime(nums);

        sc.close();
    }
}
