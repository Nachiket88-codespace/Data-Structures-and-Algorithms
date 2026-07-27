import java.util.* ; 
public class Sum_using_methods_three {

    public static int total_sum(int a_1 , int b_2){
        int total_ans = a_1 + b_2 ;
        return total_ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your 1st number : ");
        int num_1 = sc.nextInt() ;
        System.out.print("enter your 2nd number : ");
        int num_2 = sc.nextInt() ;

        int final_ans = total_sum(num_1, num_2) ;
        System.out.print("total final sum ans is : " + final_ans);

        sc.close();
    }
}