import java.util.*;

public class Largest_of_3_numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter 1st number = ");
        float num_1 = sc.nextFloat() ;
        System.out.print("enter 2nd number = ");
        int num_2 = sc.nextInt() ; 
        System.out.print("enter 3rd number = ");
        double num_3 = sc.nextDouble() ;

        if(num_1>num_2 && num_1>num_3){
            System.out.println("largest number is "+ num_1);
        }
        else if(num_2>num_1 && num_2>num_3){
            System.out.println("largest number is "+ num_2);
        }
        else{
            System.out.println("largest number is "+ num_3);
        }
        sc.close();
    }
}
