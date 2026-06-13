import java.util.*;
public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("Enter your salary = ");
        double Salary = sc.nextDouble() ; 
        double income_tax ;

        if(Salary <= 500000){
            income_tax = 0 ;
            System.out.println("tax will be = " + income_tax);
        }
        else if(Salary > 500000 && Salary <= 1000000){
            income_tax = 0.2*Salary ;
            System.out.println("Tax will be = "+ income_tax);
        }
        else if(Salary>1000000){
            income_tax = 0.3*Salary ;
            System.out.println("Tax will be = " + income_tax);
        }
        sc.close();
    }
}
