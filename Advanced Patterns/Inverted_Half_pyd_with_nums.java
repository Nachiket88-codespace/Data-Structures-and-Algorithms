import java.util.* ; 
public class Inverted_Half_pyd_with_nums {
    
    public static void Inv_half_pyd_nums(int num_of_rows){
        for(int i=1 ; i <= num_of_rows ; i++){
            for(int j=1 ; j <= num_of_rows-i+1 ; j++){
                System.out.print(j +" "  );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.print("enter number of rows : ");
        int rows_num = sc.nextInt() ; 
        
        Inv_half_pyd_nums(rows_num);
        sc.close();
    }
}
