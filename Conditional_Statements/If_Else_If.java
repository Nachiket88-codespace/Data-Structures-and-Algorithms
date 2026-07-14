import java.util.*;
public class If_Else_If {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter the age of candidate = ");
        float age = sc.nextFloat() ; 

        if(age<=13){
            System.out.println("You are not a Teenager ");
        }
        else if(age>13 && age<18){
            System.out.println("You are a Teenager ");
        }
        else if(age>=18 && age<=19){
            System.out.println("You are eligible to vote and drive ");
        }
        else if(age>19){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("enter accurate age data");
        }

        sc.close();
    }
}
