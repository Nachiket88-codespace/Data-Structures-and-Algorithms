import java.util.* ; 
public class Hollow_rectangle {
    
    public static void Hollow_Rectangle(int total_rows , int total_columns){
        // outer loop - lines or rows ; 
        for(int i=1 ; i <=total_rows ; i++){
            //inner loop - columns ; 
            for(int j=1 ; j <= total_columns ; j++){
                if(i == 1 || i == total_rows || j == 1 || j == total_columns ){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("enter number of rows : ");
        int rows_num = sc.nextInt() ; 
        System.out.print("enter number of columns : ");
        int column_num = sc.nextInt() ; 

        Hollow_Rectangle(rows_num, column_num);
        sc.close();
    }
}
