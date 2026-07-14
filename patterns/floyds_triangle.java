import java.util.Scanner;

public class floyds_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ; 
        int num = 1 ;

        for(int k=1 ; k<=total_rows ; k++){
            for(int j=1 ; j<=k ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
