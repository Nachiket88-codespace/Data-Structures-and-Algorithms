import java.util.*; 
public class d_prime_number_in_range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("enter range : ");
        int range = sc.nextInt() ; 

        for(int i=2 ; i<=range ; i++){
            boolean is_prime = true ; 
            for(int j=2 ; j<=Math.sqrt(i) ; j++){
                if(i%j == 0){
                    is_prime = false ; 
                }
            }
            if(is_prime == true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
