import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        int num_1 = sc.nextInt() ; 
        short num_2 = sc.nextShort() ;
        byte num_3 = sc.nextByte() ; 
        long num_4 = sc.nextLong() ;

        float num_5 = sc.nextFloat() ;
        double num_6 = sc.nextDouble() ; 

        boolean expression = sc.nextBoolean() ;
        String name = sc.nextLine() ; 

        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(num_5);
        System.out.println(num_6);
        System.out.println(expression);
        System.out.println(name);

        sc.close(); 
    }
}
