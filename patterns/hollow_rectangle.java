import java.util.Scanner;

public class hollow_rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num, of rows = ");
        int total_rows = sc.nextInt() ;
        System.out.print("enter num of columns = ");
        int total_columns = sc.nextInt() ;

        for(int i=1 ; i<=total_rows ; i++){
            for(int j=1 ; j<=total_columns ; j++){
                if(i==1 || i==total_rows  || j==1 || j==total_columns){
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
