import java.util.Scanner;

public class Assig_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter 1st number : ");
        int num_1 = sc.nextInt() ; 

        System.out.println(-(~num_1));
        sc.close();
    }
}
