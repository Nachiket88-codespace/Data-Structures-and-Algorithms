import java.util.*;
public class b_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter num of rows : ");
        int rows = sc.nextInt() ; 

        for(int i=1 ; i<=rows ; i++){
            for(int j=rows ; j>=i ; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}