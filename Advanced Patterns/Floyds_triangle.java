import java.util.* ; 
public class Floyds_triangle {
    public static void Floyds_triangles(int num_rows , int start_num){

        for(int i=1 ; i <= num_rows ; i++){
            for(int j=1 ; j <= i ; j++){
                System.out.print(start_num + " ");
                start_num++ ;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("enter number of rows : ");
        int rows_num = sc.nextInt() ; 
        System.out.print("enter a num from which pattern should start : ");
        int num_start = sc.nextInt() ; 

        Floyds_triangles(rows_num , num_start);
        sc.close();
    }
}
