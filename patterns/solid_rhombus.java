import java.util.Scanner;

public class solid_rhombus {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter number of rows = ");
        int total_rows = sc.nextInt() ; 

        for(int k=1 ; k<=total_rows ; k++){
            // spaces:
            for(int j=1 ; j<=(total_rows-k+1) ; j++){
                System.out.print(" "+" ");
            }
            // stars:
            for(int j=1 ; j<=total_rows ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
