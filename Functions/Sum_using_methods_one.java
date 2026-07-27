import java.util.* ;
public class Sum_using_methods_one {

    public static void calculate_sum() {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your 1st number : ");
        int num_1 = sc.nextInt() ;
        System.out.print("enter your 2nd number : ");
        int num_2 = sc.nextInt() ;

        int total_sum = num_1 + num_2 ;
        System.out.print("sum is = " + total_sum);

        sc.close();
    }

    public static void main(String[] args) {
        calculate_sum();
    }
}