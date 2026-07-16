import java.util.* ;
public class c_prime_number_two {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;

      System.out.print("enter any number = ");
      int num = sc.nextInt() ;

      boolean is_prime = true ; 
      for(int i=2 ; i<=Math.sqrt(num) ; i++){
         if(num % i == 0){
            is_prime = false ; 
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
