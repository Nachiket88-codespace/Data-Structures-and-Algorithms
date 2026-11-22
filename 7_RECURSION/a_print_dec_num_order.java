import java.util.* ;
public class a_print_dec_num_order {

    public static void print_dec_order(int num){
        if(num == 0){
            return ;
        }

        System.out.print(num+" ");
        print_dec_order(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ; 

        print_dec_order(num);

        sc.close();
    }
}
