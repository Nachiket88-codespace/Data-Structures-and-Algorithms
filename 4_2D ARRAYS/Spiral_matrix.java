import java.util.*;
public class Spiral_matrix {

    public static void spiral_display(int matrix[][]){
        int start_row = 0 ;
        int end_row = matrix.length-1 ;
        int start_column = 0 ;
        int end_column = matrix[0].length-1 ; 

        while (start_row<=end_row && start_column<=end_column) {
            
        // TOP : 
        for(int i=start_column ; i<=end_column ; i++){
            System.out.print(matrix[start_row][i] + ",");
        }
        // RIGHT : 
        for(int j=start_row+1 ; j<=end_row ; j++){
            System.out.print(matrix[j][end_column]+",");
        }
        // BOTTOM : 
        for(int k=end_column-1 ; k>=start_column ; k--){
            if(start_column == end_column){
                break ; 
            }
            System.out.print(matrix[end_row][k]+",");
        }
        // LEFT : 
        for(int m=end_row-1 ; m>=start_row+1 ; m--){
            if(start_row == end_row){
                break ; 
            }
            System.out.print(matrix[m][start_column]+",");
        }
        start_row++ ; 
        start_column++ ;
        end_row-- ; 
        end_column-- ; 
    }
}
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter num of rows of matrix = ");
        int rows = sc.nextInt() ; 
        System.out.print("enter num of columns of matrix = ");
        int columns = sc.nextInt() ;

        int matrix[][] = new int[rows][columns] ; 
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print("enter next num in next cell : ");
                matrix[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("--------------------------------------printing the matrix--------------------------------------");

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        spiral_display(matrix);

        sc.close();
    }
}
