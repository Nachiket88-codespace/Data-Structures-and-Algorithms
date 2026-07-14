import java.util.Scanner;

public class SUM_OF_EVEN_ODD {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter how many numbers to be read = ");
         int count = sc.nextInt() ; 
         int even_sum = 0 ;
         int odd_sum = 0 ;

         for(int i=1 ; i<=count ; i++){
            System.out.print("enter new number = ");
            int new_num = sc.nextInt() ; 

            if(new_num % 2 ==0){
                even_sum = even_sum + new_num ; 
            }
            else{
                odd_sum = odd_sum + new_num ; 
            }
         }

         System.out.println("even sum is = "+even_sum);
         System.out.println("odd sum is = "+odd_sum);

         sc.close();
    }
}
