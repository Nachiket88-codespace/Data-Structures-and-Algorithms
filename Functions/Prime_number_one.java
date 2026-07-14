import java.util.* ; 
public class Prime_number_one {

    public static boolean check_prime_status( int num ){
        boolean prime_status = true ; 
        if(num <= 1 ){
            prime_status = false ;
        }
        else if(num == 2){
            prime_status = true ; 
        }
        else if(num > 2 ){
            for(int j=2 ; j <= Math.sqrt(num) ; j++){
                if(num % j == 0){
                    prime_status = false ; 
                }
            }
        }
        return prime_status ; 
    }
    //===============================================================================
    
    public static boolean IS_Prime(int number){
        boolean is_prime_num = true ; 
        if(number <= 1){
            is_prime_num = false ; 
        }
        else if(number == 2 ){
            is_prime_num = true ; 
        }
        else if(number > 2){
        for(int i=2 ; i <= (number-1) ; i++){
            if(number % i == 0 ){
                is_prime_num =false ; 
                break ; 
            }
        }
    }
        return is_prime_num ;
    }
     //===============================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any number : ");
        int num = sc.nextInt() ; 

        boolean status = IS_Prime(num) ; 
        System.out.println(status);

        System.out.println("---------------------------------------------------------");

        System.out.print("enter your selected number : ");
        int numb_s = sc.nextInt() ; 

        boolean check_status = check_prime_status(numb_s) ; 
        System.out.println(check_status);

        sc.close();
    }
}
