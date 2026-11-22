import java.util.*;

public class b_print_inc_num_order {

    public static void print_increasing(int num){

        if(num == 0){
            return ;
        }
        print_increasing(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ; 

        print_increasing(num);

        sc.close();

    }
}