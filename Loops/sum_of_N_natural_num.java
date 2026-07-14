import java.util.* ; 
public class sum_of_N_natural_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("enter last digit till where you need to find the sum : ");
        int last_digit = sc.nextInt() ;
        int current_count = 1 ;
        int sum = 0 ;

        while(current_count <= last_digit){
            sum += current_count ;
            current_count++ ;

        }
        System.out.println("final sum is : " + sum);
        sc.close();
    }
}
