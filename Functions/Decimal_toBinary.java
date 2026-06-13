import java.util.* ; 
public class Decimal_toBinary {
    public static int dec_to_bin(int decimal_number){
        int binary_answer = 0 ;
        int power = 0 ;
        while (decimal_number > 0){
            int remainder = decimal_number % 2 ;
            binary_answer = binary_answer + (int)(remainder * Math.pow(10, power)) ;
            power++ ;
            decimal_number = decimal_number / 2 ;
        } 
        return binary_answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your binary number = ");
        int decimal_num = sc.nextInt() ;

        int answer = dec_to_bin(decimal_num ) ;
        System.out.println("binary conversion of "+ decimal_num + " is :" + answer );

        sc.close();
    }
}
