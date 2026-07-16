import java.util.*; 
public class SUM_OF_EVEN_ODD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter how many numbers to be read = ");
        int count = sc.nextInt() ; 
        int even_sum = 0 ;
        int odd_sum = 0 ;

        for(int i=1 ; i<=count ; i++){
            System.out.print("enter another number = ");
            int num = sc.nextInt() ;
            
            if(num % 2 == 0){
                even_sum = even_sum + num ;
            }
            else{
                odd_sum = odd_sum + num ;
            }
        }

        System.out.println("sum of even numbers is = "+ even_sum);
        System.out.print("sum of odd numbers is = "+ odd_sum);

        sc.close();
    }
}
