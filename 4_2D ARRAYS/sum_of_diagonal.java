import java.util.* ; 
public class sum_of_diagonal {

    public static int dig_sum_of_matrix(int matrix[][]){
        int sum_of_diagonal = 0 ;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(i == j){
                    sum_of_diagonal += matrix[i][j] ; 
                }
                else if(i+j == matrix.length-1){
                    sum_of_diagonal += matrix[i][j] ;
                }
            }
        }
        return sum_of_diagonal ; 
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
                System.out.print("enter next num in next  cell : ");
                matrix[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("==============================================");

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================================");

        int total_sum_of_dig = dig_sum_of_matrix(matrix) ; 
        System.out.println("the sum of diagonal numbers of matrix is : " + total_sum_of_dig);

        sc.close();
    }
}
