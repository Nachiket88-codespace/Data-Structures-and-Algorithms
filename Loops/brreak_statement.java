import java.util.*;
public class brreak_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        for (int i = 1 ; i <= 10 ; i++ ){

            if(i == 7){
                break ;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop ");

        System.out.println("------------------------------------------------");

        do{
            System.out.print("enter number of your choice : ");
            int number = sc.nextInt() ;
            if(number % 10 == 0){
                System.out.println();
                break ; 
            }
            System.out.println(number);
        }while(true) ;

        sc.close();


    }
}
