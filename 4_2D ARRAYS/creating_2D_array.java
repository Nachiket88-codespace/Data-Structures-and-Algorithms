import java.util.*;
public class creating_2D_array {

    public static void print_2D_array(int matrix[][]){

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search_2D_array(int matrix[][] , int key){

        for(int k=0 ; k<matrix.length ; k++){
            for(int h=0 ; h<matrix[0].length ; h++){
                if(matrix[k][h] == key){
                    System.out.println("key found at "+"("+k+","+h+")");
                    return true ;
                }
            }
        }
        return false ; 
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
                System.out.print("next num in matrix position : ");
                matrix[i][j] = sc.nextInt() ; 
            }
        }

        print_2D_array(matrix);
        System.out.println("--------------------------------------------------");
        System.out.print("enter key to be searched : ");
        int key_num = sc.nextInt() ;
        System.out.println("--------------------------------------------------");
        boolean status = search_2D_array(matrix, key_num) ;
        if(status == true){
            System.out.println("key found");
        }
        else{
            System.out.println("key does not exist");
        }
        sc.close();
    }
}