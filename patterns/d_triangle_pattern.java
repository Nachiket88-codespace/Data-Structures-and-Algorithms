import java.util.* ; 
public class d_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows = ");
        int row = sc.nextInt() ; 

        for(int i=1 ; i<=row ; i++){
            // spaces : 
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" "+" ");
            }
            // stars :
            for(int j=1 ; j<=row-i+1 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
