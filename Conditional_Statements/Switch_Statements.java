import java.util.*;
public class Switch_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter any item number : ");
        String input = sc.nextLine() ;

        switch (input){
            case "one" : System.out.println("bring me samosa");
            break ; 

            case "two" : System.out.println("bring me orange juice");
            break ; 

            case "three" : System.out.println("bring me burger");
            break ; 

            case "four" : System.out.println("bring me honey");
            break ; 

            case "five" : System.out.println("bring me anything of your choice ");
            break ; 

            default : System.out.println("i don't want anything ");
            break ; 
        }

        sc.close();
    }
}
