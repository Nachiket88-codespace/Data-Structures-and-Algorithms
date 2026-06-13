import java.util.Scanner;

public class SUM_OF_EVEN_ODD {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
         System.out.print("enter a number num's to be read = ");
         int count = sc.nextInt() ; 

         int sum_even = 0 ; 
         int sum_odd = 0 ;
         for(int i=1 ; i<=count ; i++){
            System.out.print("enter a new num : ");
            int num = sc.nextInt() ; 

            if(num % 2 == 0){
                sum_even = sum_even + num ; 
            }
            else{
                sum_odd = sum_odd + num ; 
            }
         }

         System.out.println("even sum is = "+sum_even);
         System.out.println("odd sum is = "+sum_odd);

         sc.close();
    }
}
