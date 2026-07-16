import java.util.Scanner;

public class b_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        
        System.out.print("enter total num of rows = ");
        int total_rows = sc.nextInt() ;

        for(int i=1 ; i<=total_rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

