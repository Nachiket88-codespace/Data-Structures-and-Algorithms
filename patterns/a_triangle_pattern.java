import java.util.*;
public class a_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int rows = sc.nextInt() ; 

        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
