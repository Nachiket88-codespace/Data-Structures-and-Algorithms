import java.util.* ;
public class Binary_to_Decimal {

    public static int Decimal_convert(int number){
        int dec_num = 0 ;
        int temp_num = number ;
        int power = 0 ;

        while(temp_num > 0){
            int remainder = temp_num % 10 ;
            temp_num = temp_num / 10 ;
            dec_num = dec_num + (remainder*(int)Math.pow(2, power)) ;
            power++ ;
        }

        return dec_num ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your binary number : ");
        int bin_num = sc.nextInt() ; 

        int dec_ans = Decimal_convert(bin_num) ;
        System.out.println(dec_ans);

        sc.close();
    }
}