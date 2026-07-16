import java.util.*;
public class zero_one_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ;

        for(int i=1 ; i<=total_rows ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j) % 2 ==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
