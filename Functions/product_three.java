import java.util.* ; 
public class product_three {
    public static int multiply(int num_1 , int num_2){
        int product = num_1 * num_2 ; 
        return product ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter 1st num : ");
        int xyz = sc.nextInt() ; 
        System.out.print("enter 2nd num : ");
        int ghi = sc.nextInt() ;

        int answer = multiply(xyz, ghi) ; 
        System.out.println("product is : " + answer);

        sc.close();
    }
}
