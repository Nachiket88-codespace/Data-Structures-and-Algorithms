import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 

        System.out.print("enter last digit till where u wnat to print = ");
        int num = sc.nextInt() ; 

        for (int i = 1 ; i <= num ; i++){
            System.out.println(i);
        }
        sc.close();

        for(int k=1 ; k <= 4 ; k++){
            System.out.println("****");
        }
    }
}
