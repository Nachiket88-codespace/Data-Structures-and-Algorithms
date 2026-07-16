import java.util.*;
public class hollow_rhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ;

        System.out.print("enter num of columns = ");
        int total_columns = sc.nextInt() ;

        for(int i=1 ; i<=total_rows ; i++){
            //spaces:
            for(int j=1 ; j<=(total_rows-i+1) ; j++){
                System.out.print(" "+" ");
            }
            //stars:
            for(int j=1 ; j<=total_columns ; j++){
                if(i==1 || i==total_rows || j==1 || j==total_columns){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
