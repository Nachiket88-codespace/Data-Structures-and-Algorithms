import java.util.* ; 
public class search_sorted_matrix {

    public static boolean staircase_search(int array_matrix[][] , int key){
        int row_num = 0 ; 
        int col_num = array_matrix[0].length-1 ; 

        while(row_num <= array_matrix.length-1 && col_num >= 0 ){
            if(array_matrix[row_num][col_num] == key){
                System.out.println("key found at : "+"("+row_num+","+col_num+")");
                return true ; 
            }
            else if(key < array_matrix[row_num][col_num]){
                col_num-- ; 
            }
            else{
                row_num++ ; 
            }
        } 
        System.out.println("key not found ");
        return false ; 
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ; 
        int array_matrix[][] = {{10,20,30,40},
                                {15,25,35,45},
                                {27,29,37,48},
                                {32,33,39,50}} ; 

            System.out.print("enter key : ");
            int key_num = sc.nextInt() ; 

            boolean status = staircase_search(array_matrix, key_num) ; 
            System.out.println(status);
            
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");                    

        
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

        sc.close();
    }
}
