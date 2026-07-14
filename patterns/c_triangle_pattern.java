import java.util.Scanner;

public class c_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ; 

        for(int k=1 ; k<=total_rows ; k++){
            for(int j=1 ; j<=(total_rows-k+1) ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
