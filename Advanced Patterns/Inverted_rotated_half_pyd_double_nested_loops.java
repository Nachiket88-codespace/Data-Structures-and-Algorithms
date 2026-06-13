import java.util.* ; 
public class Inverted_rotated_half_pyd_double_nested_loops {
    
    public static void Inverted_Rotated_Half_Pyd_double_Nested_Loops(int Number_lines){
        //outer loop - lines/rows ; 
        for(int i=1 ; i <= Number_lines ; i++){
            //inner loop - spaces ; 
            for(int j=1 ; j <= (Number_lines-i) ; j++){
                System.out.print(" ");
            }
            //inner loop - stars ; 
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("enter number of rows : ");
        int rows_num = sc.nextInt() ; 
        

        Inverted_Rotated_Half_Pyd_double_Nested_Loops(rows_num);
        sc.close();
    }
}
