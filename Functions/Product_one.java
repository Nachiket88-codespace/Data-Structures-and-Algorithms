import java.util.* ; 
public class Product_one {
    public static void multiply(){
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter 1st number : ");
        int num_1 = sc.nextInt() ; 
        System.out.print("enter 2nd number : ");
        int num_2 = sc.nextInt() ; 

        int product = num_1 * num_2 ; 
        System.out.println("product is : " + product);

        sc.close();
    }

    public static void main(String[] args) {
        multiply();
    }
}
