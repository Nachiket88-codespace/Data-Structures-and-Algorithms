import java.util.* ;
public class Use_of_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("insert your 1st number = ");
        float number_1 = sc.nextFloat(); 
        System.out.print("insert your 2nd number = ");
        int number_2 = sc.nextInt() ; 
        float sum = number_2 + number_1 ; 
        System.out.println(sum);

        System.out.println("--------------------------------------");

        System.out.print("insert your 3rd number = ");
        double number_3 = sc.nextDouble() ; 
        System.out.print("insert your 4th number = ");
        long number_4 = sc.nextLong() ; 

        double product = number_3*number_4 ; 
        System.out.println(product);

        System.out.println("--------------------------------------");

        System.out.print("enter the radius = ");
        float radius = sc.nextFloat() ;
        double Area = 3.14*(radius)*(radius) ;

        System.out.println("area of circle is = "+ Area);

        sc.close();
    }
}
