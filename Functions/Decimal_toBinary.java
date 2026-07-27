import java.util.* ;
public class Decimal_toBinary {

    public static int Binary_convert(int decimal_number){
        int temp_num = decimal_number;
        int power = 0 ;
        int bin_num = 0 ;

        while(temp_num > 0){
            int remainder = temp_num % 2 ;
            temp_num = temp_num / 2 ;
            bin_num = bin_num + (remainder*(int)Math.pow(10, power)) ;
            power++ ;

        }

        return bin_num ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your decimal number ");
        int decimal_num = sc.nextInt() ;

        int final_ans = Binary_convert(decimal_num) ;
        System.out.println(final_ans); 

        sc.close();
    }
}