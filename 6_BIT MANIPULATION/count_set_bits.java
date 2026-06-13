import java.util.Scanner;

public class count_set_bits {

    public static void count_set(int number){
        int count = 0 ; 
        int bit_mask = 1 ; 
        while (number > 0) {
            if((number & bit_mask) == 1 ){
                count++ ; 
                number =  number>>1 ; 
            }
            else{
               number =  number>>1 ; 
            }
        }
        System.out.println("total sets in number are : " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter number = ");
        int number = sc.nextInt() ; 
        count_set(number);
        sc.close();

    }
}
