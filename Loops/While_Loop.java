import java.util.*;
public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("enter how many times u want to print : ");
        int counter = sc.nextInt() ; 
        int current_count = 0 ;

        while(current_count < counter){
            System.out.println("HELLO WORLD !!!");
            current_count++ ;
        }

        sc.close();
    }
}
