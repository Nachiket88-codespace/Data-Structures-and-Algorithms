import java.util.Scanner;

public class d_print_sum_of_natural_num {
    
    public static int print_sum(int num){

        if(num == 1){
            return 1 ;
        }

        int fnm1 = print_sum(num-1) ;
        int sum = num + fnm1 ;

        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter any num : ");
        int num = sc.nextInt() ;

        System.out.println(print_sum(num));

        sc.close() ;
    }
}
