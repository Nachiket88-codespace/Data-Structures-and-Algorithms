import java.util.Scanner;

public class b_prime_number_one {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ; 
      System.out.print("enter any number = ");
      int num = sc.nextInt() ; 

      boolean is_prime = true ; 
      for(int i=2 ; i<=(num-1) ; i++){
         if(num % i == 0){
            is_prime = false ; 
         }
      }

      if(is_prime == true){
         System.out.println(num+" is prime ");
      }
      else{
         System.out.println(num+" is not prime ");
      }

      sc.close();
   }
}