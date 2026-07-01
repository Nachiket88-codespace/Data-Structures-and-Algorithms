import java.util.*;
public class solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ; 

        for(int i=1 ; i<=total_rows ; i++){
            //spaces:
            for(int j=1 ; j<=(total_rows-i) ; j++){
                System.out.print(" "+" ");
            }
            //stars:
            for(int j=1 ; j<=total_rows ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
