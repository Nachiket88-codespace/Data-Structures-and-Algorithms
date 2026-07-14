import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter the 1st number : ");
        float num_1 = sc.nextFloat() ;
        System.out.println("enter the 2nd number :  ");
        double num_2 = sc.nextDouble() ; 

        System.out.println("enter the operation u wnat to perform : ");
        String Operation = sc.nextLine() ; 

        switch(Operation){
            case "Addition" : double sum = num_2 + num_1 ; 
            System.out.println(sum);
            break ; 

            case "Subtraction" : double sub = num_2 - num_1 ;
            double sub_2 = num_1 - num_2 ;
            System.out.println(sub);
            System.out.println(sub_2);
            break ; 

            case "multiply" : double multiplication = num_2 * num_1 ; 
            System.out.println(multiplication);
            break ; 

            case "Division" : double divide = num_2/ num_1 ; 
            double divide_2 = num_1 / num_2 ; 
            System.out.println(divide);
            System.out.println(divide_2);
            break ;

            case "Modulo" : double remainder = num_1 % num_2 ; 
            double remainder_2 = num_2 % num_1 ; 
            System.out.println(remainder);
            System.out.println(remainder_2 );
            break ; 

            default : System.out.println("enter only opertaions among :") ;
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Divison");
            System.out.println("5) Modulo");
            break ; 
}
sc.close();
    }
}