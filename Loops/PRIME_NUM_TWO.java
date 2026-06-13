import java.util.*;
public class PRIME_NUM_TWO {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
         System.out.print("enter a number greater >= 2 : ");
         int num = sc.nextInt() ; 

         boolean is_prime = true ; 
         if(num == 2){
            System.out.println("2 is a prime number ");
         }
         else if(num != 2){
            for(int i=2 ; i<=Math.sqrt(num) ; i++){
                if(num % i == 0){
                    is_prime  =false ; 
                }
            }
         }

         if(is_prime == true){
            System.out.print(num + " is a prime number");
         }
         else{
            System.out.print(num + " is not a prime number");
         }

         sc.close();
    }
}

