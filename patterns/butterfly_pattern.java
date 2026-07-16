import java.util.*  ;
public class butterfly_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ;

        //upper part:
        for(int i=1 ; i<=total_rows ; i++){
            //stars:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            //spaces:
            for(int j=1 ; j<=(total_rows*2)-(i*2) ; j++){
                System.out.print(" "+" ");
            }
            //stars:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        //lower triangle:
        for(int i=total_rows ; i>=1 ; i--){
            //stars:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            //spaces:
            for(int j=1 ; j<=(total_rows*2)-(i*2) ; j++){
                System.out.print(" "+" ");
            }
            //stars:
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
