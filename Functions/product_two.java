import java.util.* ; 
public class product_two {
    public static void multiply(int num_1 , int num_2){
        int product = num_1 * num_2 ;
        System.out.println("product is : " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter number_1 = "  );
        int abc = sc.nextInt() ; 
        System.out.print("enter number_2 = ");
        int def = sc.nextInt() ; 

        multiply(abc, def);

        sc.close();
    }
}
