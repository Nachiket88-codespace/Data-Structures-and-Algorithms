import java.util.*;
public class num_1_to_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int count = 1 ; 
        while (count <= 10) {
            System.out.println(count);
            count++ ;
        }

        System.out.println("enter the last number : ");
        int last_num = sc.nextInt() ;
        int current_count = 1 ;
        int i = 1 ;

        while (current_count <= last_num) {
            System.out.println(i + ") " + current_count);
            current_count++ ; 
            i++ ;
        }

        sc.close();
    }
}
