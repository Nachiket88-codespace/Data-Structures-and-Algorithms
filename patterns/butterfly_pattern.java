import java.util.*;
public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ; 

        for(int i=1 ; i<=total_rows ; i++){
            //stars:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            //space:
            for(int j=1 ; j<=(total_rows*2 - 2*i) ; j++){
                System.out.print(" "+" ");
            }
            //star:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=1 ; i<=total_rows ; i++){
            //stars:
            for(int k=1 ; k<=(total_rows-i+1) ; k++){
                System.out.print("*"+" ");
            }
            //space:
            for(int k=1 ; k<=((i-1)*2) ; k++){
                System.out.print(" "+" ");
            }
            //star:
            for(int k=1 ; k<=(total_rows-i+1) ; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
