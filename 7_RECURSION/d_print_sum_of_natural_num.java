import java.util.*;

public class d_print_sum_of_natural_num {

    public static int sum_of_num(int num){

        if(num == 0){
            return 0 ; 
        }

        int gnm1 = sum_of_num(num-1);
        int gn = num + gnm1 ;

        return gn ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ;

        System.out.println(sum_of_num(num));
        
        sc.close();


    }
}