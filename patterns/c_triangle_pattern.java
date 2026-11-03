import java.util.* ;

public class c_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter num of rows : ");
        int max_row = sc.nextInt() ; 

        for(int i=1 ; i<=max_row ; i++){
            for(int j=1 ; j<=max_row-i ; j++){
                System.out.print(" "+" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}