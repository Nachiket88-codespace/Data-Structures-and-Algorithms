import java.util.* ; 
public class b_print_inc_num_order {

    public static void print_inc_order(int n){

        if(n == 1){
            System.out.print(n+" ");
            return ;
        }

        print_inc_order(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter any num : ");
        int num = sc.nextInt() ;

        print_inc_order(num);

        sc.close();
    }
}