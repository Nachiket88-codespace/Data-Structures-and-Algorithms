import java.util.*; 
public class Nested_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("enter number of lines of pattern to be printed :  ");
        int number = sc.nextInt() ;

        for(int line = 1 ; line <= number ; line++ ){
            for(int print = 1 ;print <= line ; print++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}