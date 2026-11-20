import java.util.Scanner;

public class a_print_dec_num_order {

    public static void print_dec_order(int n){

        if(n == 1){
            System.out.println(n);
            return ;
        }

        System.out.print(n+" ");
        print_dec_order(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter any num : ");
        int num = sc.nextInt() ; 

        print_dec_order(num);

        sc.close();
    }
}
