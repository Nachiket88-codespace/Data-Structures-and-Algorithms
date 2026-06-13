import java.util.* ; 
public class Inverted_Rotated_half_pyd {

    public static void Inverted_rotated_half_pyramid(int num_rows , int num_columns){
        //outer loop - lines/rows ; 
        for(int i=1 ; i <= num_rows ; i++){
            // inner loop - columns ; 
            for(int j=1 ; j <= num_columns ; j++){

                if((i+j) >= (num_columns + 1)){
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

        Inverted_rotated_half_pyramid(rows_num, column_num);
        sc.close();
    }
    
} 
