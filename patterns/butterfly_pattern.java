import java.util.*; 
public class butterfly_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows : ");
        int rows = sc.nextInt() ; 

        for(int i=1 ; i<=rows ; i++){
            // starts -----
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            // spaces -----
            for(int j=1 ; j<=(rows*2)-(i*2) ; j++){
                System.out.print(" "+" ");
            }
            // starts -----
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1 ; i<=rows ; i++){
            // stars -----
            for(int j=1 ; j<=rows-i+1 ; j++){
                System.out.print("*"+" ");
            }
            // spaces -----
            for(int j=1 ; j<=(rows*2)-(2*(rows-i+1)) ; j++){
                System.out.print(" "+" ");
            }
            // stars -----
            for(int j=1 ; j<=rows-i+1 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}