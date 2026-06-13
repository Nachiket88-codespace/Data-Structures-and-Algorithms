import java.util.* ; 
public class Triangle_0_1 {

    public static void zero_one_triangle(int number_of_rows){
        for(int i=1 ; i <= number_of_rows ; i++){
            for(int j=1 ; j <= i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1" + " ");
                }
                else if((i+j) % 2 != 0){
                    System.out.print("0" + " ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("enter number of rows : ");
        int rows_num = sc.nextInt() ; 

        zero_one_triangle(rows_num);
        sc.close();
    }
    
} 
