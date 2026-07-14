import java.util.* ;
public class Sum_using_methods_two {
    public static void calculate_sum(int num_1 , int num_2){
        int sum = num_1 + num_2 ; 
        System.out.println(" sum is : " + sum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter 1st number : ");
        int a = sc.nextInt() ; 
        System.out.print("enter 2nd number : ");
        int b = sc.nextInt() ;
        calculate_sum(a, b);

        sc.close();
    }
}
