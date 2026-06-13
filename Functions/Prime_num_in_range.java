import java.util.* ;
public class Prime_num_in_range {
    
    public static boolean Is_prime_no(int num ){
        boolean is_prime = true ; 
        for(int i=2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0 ){
                is_prime = false ;
            }
        }
        return is_prime ; 
    }

        public static void prime_in_range(int range){
            for(int j=2 ; j <= range ; j++){
                if(Is_prime_no(j) == true){
                    System.out.print(j);
                }
                System.out.print(".");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            System.out.print("enter the range of number : ");
            int range_of_num = sc.nextInt() ;
            prime_in_range(range_of_num);

            sc.close();
        }
    
}