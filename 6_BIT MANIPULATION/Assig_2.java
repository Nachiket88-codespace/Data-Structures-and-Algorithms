import java.util.Scanner;

public class Assig_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter 1st number : ");
        int num_1 = sc.nextInt() ; 
        System.out.print("enter 2nd number :");
        int num_2 = sc.nextInt() ;

        System.out.println(num_1);
        System.out.println(num_2);

        num_1 = num_1 ^ num_2 ; 
        num_2 = num_1 ^ num_2 ; 
        num_1 = num_1 ^ num_2 ; 

        System.out.println("-----------------------------------------");

        System.out.println(num_1);
        System.out.println(num_2);

        sc.close();


    }
}
